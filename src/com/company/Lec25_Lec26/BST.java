package com.company.Lec25_Lec26;

import java.util.Arrays;

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

        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }


    public void preandin(int[] pre, int[] in){

        this.root = preandin(root,pre, in);
    }

    private Node preandin(Node node,int[] pre, int[] in) {

        if(in.length==0){
            return node;
        }

        int ele = pre[0];

        int index =find(in, ele);

        int[] pre_left = Arrays.copyOfRange(pre,1,index+1);
        int[] pre_right = Arrays.copyOfRange(pre,index+1, pre.length);

        int[] in_left = Arrays.copyOfRange(in, 0,index);
        int[] in_right = Arrays.copyOfRange(in,index+1,in.length);

        Node node1 = new Node(ele);

        node1.left= preandin(node1.left,pre_left,in_left);
        node1.right = preandin(node1.right,pre_right,in_right);

        return node1;
    }

    private int find(int[] in, int ele) {

        for (int i = 0; i <in.length ; i++) {

            if(in[i]==ele){
                return i;
            }
        }

        return -1;
    }

    public int height(){

        return height(root);
    }

    private int height(Node node) {

        if(node ==null){
            return 0;
        }

        return node.height;

    }

    public void display(){
        display(root, "");
    }
    private void display(Node node, String indent) {
//preorder
        if(node == null){
            return;
        }


        System.out.println(indent+node.value);

        display(node.left,indent+"\t");

        display(node.right,indent+"\t");

    }

    public void inrange(int k1, int k2){
        inrange(root,k1,k2);
    }

    private void inrange(Node node, int k1, int k2){

        if(node == null ){
            return;
        }

        if(node.value>k1 && node.value<k2){
            System.out.println(node.value);
        }

        if(node.value>k1){
            inrange(node.left,k1,k2);
        }

        if(node.value<k2){
            inrange(node.right,k1,k2);
        }
    }

    public void makefromsorted(int[] ar, int low, int high){

        if(low>high){
            return;
        }

        int mid =(low+high)/2;

        insert(ar[mid]);

        makefromsorted(ar,low,mid-1);
        makefromsorted(ar,mid+1, high);
    }

    public int successor(int value){

        Node succ = null;

        Node curr = root;


        while(curr != null){

            if(value<curr.value){
                succ = curr;
                curr = curr.left;
            }

            else{
                curr = curr.right;
            }
        }

        if(succ == null){
            return -1;
        }
        else{
            return succ.value;
        }
    }

    class Node{

        int value;
        Node left;
        Node right;
        int height =1;

        public Node(int value) {
            this.value = value;
        }
    }
}
