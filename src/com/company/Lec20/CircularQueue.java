package com.company.Lec20;

public class CircularQueue {

    private int[] data;
    private int rear;
    private int front;
    private int size;

    public CircularQueue(){

        this.data = new int[10];
        this.rear = 0;
        this.front =0;
        this.size =0;

    }

    private boolean isFull(){
        return size== data.length;
    }

    public void enqueue(int element){

        if(isFull()){
            return;
        }

        data[rear++] = element;

        rear= rear%data.length;

        size++;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int deque(){
// 0(n)
        if(isEmpty()){
            return -1;
        }

        front = front % data.length;
        size--;
        return data[front++];

    }

    public void display(){

        for (int i = 0; i <size ; i++) {

            System.out.println(data[(front+i)%data.length]);
        }

    }

}
