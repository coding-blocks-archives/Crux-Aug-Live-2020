package com.company.Lec25;

import java.util.Scanner;

public class BST {

    private Node root;

    public void insert(int value){

        this.root = insert(root, value);
    }

    private Node insert(Node node, int value) {

        if(node == null){

            return new Node(value);
        }


        if(node.value>value){

            node.left =insert(node.left,value);
        }

        else{
            node.right = insert(node.right,value);
        }

        return node;
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent) {
//preorder
        if(node ==null){
            return;
        }

        System.out.println(indent+node.value);

        display(node.left,indent+"\t");

        display(node.right,indent+"\t");

    }

    class Node{

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
