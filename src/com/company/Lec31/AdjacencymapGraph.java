package com.company.Lec31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class AdjacencymapGraph<T> {

   HashMap<T, Vertex> vertexMap = new HashMap<>();

   HashMap<Vertex, Vertex> parent = new HashMap<>();

   public void addVertex(T value){

       vertexMap.put(value, new Vertex(value));
   }

   public void addEdge(T first, T second){

       Vertex f = vertexMap.get(first);
       Vertex s = vertexMap.get(second);

       if(f!=null && s!=null){

           f.neighbours.put(s,1);
           s.neighbours.put(f,1);
       }
   }

    public void addEdgeWeight(T first, T second, int weight){

        Vertex f = vertexMap.get(first);
        Vertex s = vertexMap.get(second);

        if(f!=null && s!=null){

            f.neighbours.put(s,weight);
            s.neighbours.put(f,weight);
        }
    }

   public void display(){

       for (Vertex vertex: vertexMap.values()) {

           System.out.print(vertex.value + " => ");

           for (Vertex padosi:vertex.neighbours.keySet()) {

               System.out.print(padosi.value + " ");
           }
           System.out.println();
       }
       System.out.println();
   }

   public AdjacencymapGraph<T> kruskal(){

       AdjacencymapGraph<T> graph = new AdjacencymapGraph<>();

       ArrayList<Edge> edges = new ArrayList<>();

       for (T value: vertexMap.keySet()) {

           graph.addVertex(value);
       }

       for (Vertex vertex:vertexMap.values()) {

           for (Vertex padosi:vertex.neighbours.keySet()) {

               edges.add(new Edge(vertex,padosi, vertex.neighbours.get(padosi)));
           }
       }

       Collections.sort(edges);

       for (Edge e: edges) {

           if(union(e.first, e.second)){


               graph.addEdgeWeight(e.first.value,e.second.value,e.weight);
           }
       }

       return graph;

   }

    public boolean union(Vertex first, Vertex second){

       Vertex f = find(first);
       Vertex s = find(second);

       if(!f.value.equals(s.value)){

           parent.put(second,first);
           return true;
       }

       return false;
    }

    public Vertex find(Vertex vertex){

       while(parent.get(vertex)!=null){

           vertex = parent.get(vertex);
       }

       return vertex;
    }

   public void setParent(){

       for (Vertex vertex:vertexMap.values()) {

           parent.put(vertex,null);
       }
   }

   class Edge implements Comparable<Edge> {

       Vertex first;
       Vertex second;
       Integer weight;

       public Edge(Vertex first, Vertex second, Integer weight) {
           this.first = first;
           this.second = second;
           this.weight = weight;
       }

       @Override
       public int compareTo(Edge o) {
           return this.weight - o.weight;
       }
   }

   class Vertex{

       T value;

       HashMap<Vertex, Integer> neighbours;

       public Vertex(T value) {
           this.value = value;
           this.neighbours= new HashMap<>();
       }
   }

}
