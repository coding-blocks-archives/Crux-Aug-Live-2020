package com.company.Lec22;

public class LinkedList {

    Node head;
    Node tail;
    int size=0;


    public void insertfirst(int value){

        Node node = new Node(value);
        node.next = head;
        head =node;

        if(tail==null){

            tail=node;
        }
        size++;
    }

    public void insertlast(int value){

        if(size==0){
            insertfirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;

        tail= node;
        size++;
    }

    public void display(){

        Node temp = head;

        while(temp!=null){

            System.out.print(temp.value + " ->");
            temp=temp.next;
        }
        System.out.print("end");
    }

    public int deletefirst(){

        if(size==0){
            System.out.println("list khaali he");
            return -1;
        }

        int temp = head.value;

        head = head.next;


        if(head==null){

            tail =null;
        }

        size--;

        return temp;
    }

    public int deleteLast(){

        if(size<2){

            return deletefirst();
        }

        Node temp = head;

        while(temp.next!=tail){

            temp = temp.next;
        }

        int del= temp.next.value;

        temp.next =null;

        tail= temp;

        size--;

        return del;
    }

    public void insertatindex(int index, int value){

        if(index==0){
            insertfirst(value);
            return;
        }

        if(index==size){
            insertlast(value);
            return;
        }

        Node prev = get(index-1);

        Node node = new Node(value);

        node.next =prev.next;

        prev.next =node;

        size++;
    }

    public int deleteatindex(int index){

        if(index == 0){
           return deletefirst();
        }

        if(index == size-1){

            return deleteLast();
        }

        Node prev = get(index-1);

        int temp = prev.next.value;

        prev.next =prev.next.next;

        size--;

        return temp;
    }

    public Node get(int index){

        Node temp = head;

        for (int i = 0; i <index ; i++) {

            temp=temp.next;
        }
        return temp;
    }


    public void reverse(){
        reverse(head);
    }

    private void reverse(Node node) {

        if(node==tail){
            head=tail;
            return;
        }

        reverse(node.next);

        tail.next = node;

        node.next =null;

        tail = node;
    }

    private class Node{

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
