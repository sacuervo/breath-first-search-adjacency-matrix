package me.santiagocuervo;

import java.util.ArrayList;

public class Graph {
    ArrayList<GraphNode> nodeList; // Store all nodes
    int[][] adjacencyMatrix; // Declare adjacency matrix

    public Graph(ArrayList<GraphNode> nodeList) { // Receive a node list as a constructor argument
        this.nodeList = nodeList; // Initialize the instance attribute node list
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()]; // Initialize the adjacency matrix based on the
                                                                     // number of nodes
    }

    public void addUndirectedEdge(int i, int j) { // Bidirectional edges mean both edge paths have to be specified with
                                                  // 1
        adjacencyMatrix[i][j] = 1; // First path
        adjacencyMatrix[j][i] = 1; // Second path
    }

    public void printAdjacencyMatrix() {
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
