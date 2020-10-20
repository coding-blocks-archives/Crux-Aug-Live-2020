package com.company.LEc30;

import java.util.*;

public class AdjacencyListGraph {

    LinkedList<Vertex> vertices= new LinkedList<>();

    public void addVertex(String value){

        vertices.add(new Vertex(value));

    }

    public void addEdge(String first, String second){


        Vertex f = find(first);
        Vertex s = find(second);

        if(f!=null && s!=null){

            f.neighbours.add(s);
            s.neighbours.add(f);
        }
    }

    public void display(){

        for (Vertex vertex : vertices) {

            System.out.print(vertex.value + " => ");

            for (Vertex padosi:vertex.neighbours) {

                System.out.print(padosi.value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public Vertex find(String value){

        for (Vertex vertex: vertices) {

            if(vertex.value.equals(value)){
                return vertex;
            }
        }

        return null;
    }

    public void DFT(){

        Set<Vertex> visited = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        Vertex vertex = vertices.get(0);

        visited.add(vertex);
        stack.push(vertex);

        while(!stack.isEmpty()){

            Vertex temp = stack.pop();

            System.out.println(temp.value);

            for (Vertex padosi :temp.neighbours) {

                if(!visited.contains(padosi)){

                    stack.add(padosi);
                    visited.add(padosi);
                }
            }
        }
    }

    public void BFT(){

        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        Vertex vertex = vertices.get(0);

        visited.add(vertex);
        queue.add(vertex);

        while(!queue.isEmpty()){

            Vertex temp = queue.remove();

            System.out.println(temp.value);

            for (Vertex padosi :temp.neighbours) {

                if(!visited.contains(padosi)){

                    queue.add(padosi);
                    visited.add(padosi);
                }
            }
        }
    }

    public int connectedComponents(){

        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        int cnt =0;
        for(Vertex vertex: vertices){

            if(visited.contains(vertex)){
                continue;
            }

            cnt=cnt+1;
            visited.add(vertex);
            queue.add(vertex);

            while(!queue.isEmpty()){

                Vertex temp = queue.remove();

                System.out.print (temp.value + " ");

                for (Vertex padosi :temp.neighbours) {

                    if(!visited.contains(padosi)){

                        queue.add(padosi);
                        visited.add(padosi);
                    }
                }
            }
            System.out.println();

        }
        return cnt;
    }

    public boolean isConnected(){

        return connectedComponents()<=1;
    }

    class Vertex{

        String value;
        LinkedList<Vertex> neighbours;

        public Vertex(String value) {
            this.value = value;
            this.neighbours = new LinkedList<>();
        }
    }
}
