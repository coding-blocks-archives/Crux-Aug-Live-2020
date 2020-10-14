package com.company.Lec22Lec23;

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
        System.out.println("end");
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

    public int kthfromlast(int k){

        Node slow = head;
        Node fast = head;

        for (int i = 0; i <k ; i++) {

            fast= fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        return slow.value;
    }

    public Node mid(){

        Node slow =head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public LinkedList merger(LinkedList first, LinkedList second){


        Node f = first.head;
        Node s = second.head;

        LinkedList l3 = new LinkedList();

        while(f!=null && s!=null){

            if(f.value <s.value){
                l3.insertlast(f.value);
                f=f.next;
            }

            else{
                l3.insertlast(s.value);
                s=s.next;
            }
        }

        while(f!=null){
            l3.insertlast(f.value);
            f=f.next;
        }

        while(s!=null){
            l3.insertlast(s.value);
            s=s.next;
        }

        return l3;
    }

    public LinkedList merge(LinkedList list){

        if(list.size == 1){
            return list;
        }

        LinkedList first = new LinkedList();
        LinkedList second = new LinkedList();

        Node mid = mid();

        first.head = list.head;
        first.tail = mid;
        first.size = (list.size+1)/2;

        second.head = mid.next;
        second.tail = list.tail;
        second.size = list.size/2;

        mid.next=null;

        first =merge(first);
        second =merge(second);

        return merger(first,second);
    }

    private class Node{

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
