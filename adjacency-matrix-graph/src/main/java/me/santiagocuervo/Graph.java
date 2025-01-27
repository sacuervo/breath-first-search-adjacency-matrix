package me.santiagocuervo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<GraphNode> nodeList;
    int[][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];

    }

    public void addUndirectedEdge(int i, int j) {

        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public void printAdjacencyMatrix() {
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main BFS (Calls the other BFS method with main functionality)
    public void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }

    // get neighbors
    public ArrayList<GraphNode> getNeighbors(GraphNode node) {
        ArrayList<GraphNode> neighbors = new ArrayList<>();
        int nodeIndex = node.index;

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {
                neighbors.add(nodeList.get(i));
            }
        }

        return neighbors;
    }

    // BFS internal (Main funcionality)
    void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                }
            }
        }

    }
}