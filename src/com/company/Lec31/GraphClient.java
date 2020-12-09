package com.company.Lec31;

public class GraphClient {

    public static void main(String[] args) {

        AdjacencymapGraph<String> graph = new AdjacencymapGraph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdgeWeight("B","D",4);
        graph.addEdgeWeight("C","D",2);
        graph.addEdgeWeight("A","C",1);
        graph.addEdgeWeight("A","B",3);
        graph.addEdgeWeight("A","D",2);

        AdjacencymapGraph<String> ans = graph.prims();
        ans.display();


    }
}
