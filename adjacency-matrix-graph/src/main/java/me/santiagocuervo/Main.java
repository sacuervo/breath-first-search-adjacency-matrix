package me.santiagocuervo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>(){}; 

        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));

        Graph g = new Graph(nodeList);

        // A Node edges
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(0, 3);

        // B Node edges
        g.addUndirectedEdge(1, 3);

        // C Node edges
        g.addUndirectedEdge(2, 3);

        // D Node edges 
        g.addUndirectedEdge(3, 4);

        g.printAdjacencyMatrix();
    }
}