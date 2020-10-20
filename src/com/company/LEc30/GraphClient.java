package com.company.LEc30;

public class GraphClient {


    public static void main(String[] args) {

        AdjacencyListGraph graph = new AdjacencyListGraph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge("B","D");
        graph.addEdge("C","D");
        graph.addEdge("A","C");
        graph.addEdge("A","B");
        graph.addEdge("A","E");


//        graph.display();

//        graph.DFT();
        System.out.println(graph.connectedComponents());
        System.out.println(graph.isConnected());
    }
}
