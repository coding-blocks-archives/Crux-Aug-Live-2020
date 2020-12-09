package com.company.Lec31;

import com.company.Lec28.Heaps;

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

    /*fix*/   setParent(); // Didn't called it, athough it wouldn't cause problem

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

   class PrimsPair implements Comparable<PrimsPair>{

       T vertex;

       T acqvertex;

       int cost;

//
//       public PrimsPair(T vertex, T acqvertex, int cost) {
//           this.vertex = vertex;
//           this.acqvertex = acqvertex;
//           this.cost = cost;
//       }


       @Override
       public int compareTo(PrimsPair o) {
           return this.cost - o.cost;
       }
   }

   public AdjacencymapGraph<T> prims(){

       AdjacencymapGraph<T> graph = new AdjacencymapGraph<>();
       Heaps<PrimsPair> heaps = new Heaps<>();

       HashMap<T, PrimsPair> map = new HashMap<>();


       // updating our heap  with all pairs
       for (T key:vertexMap.keySet()) {

           PrimsPair np = new PrimsPair();

           np.vertex = key;
           np.acqvertex= null;
           np.cost = Integer.MAX_VALUE;

           heaps.insert(np);
           map.put(key, np);
       }

      // started removing from our heap
       while(!heaps.isEmpty()){


           PrimsPair rp = heaps.delete();
           map.remove(rp.vertex);

           if(rp.acqvertex ==null){

               graph.addVertex(rp.vertex);
           }

           else{
               graph.addVertex(rp.vertex);
               graph.addEdgeWeight(rp.vertex, rp.acqvertex, rp.cost);
           }

           // for checking the cost between all the neighbours

           for (Vertex padosi: vertexMap.get(rp.vertex).neighbours.keySet()) {

               if(map.containsKey(padosi.value)){

                   int old = map.get(padosi.value).cost;
                   int newcost = vertexMap.get(rp.vertex).neighbours.get(padosi);

                   if(old>newcost){

                       PrimsPair gp = map.get(padosi.value);

                       gp.acqvertex = rp.vertex;
                       gp.cost =newcost;
                       heaps.update(gp);
                   }

               }
           }
       }

       return graph;
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
