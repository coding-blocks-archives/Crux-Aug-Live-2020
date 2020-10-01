package com.company.Lec14;

public class Queue {

    private int[] data;
    private int rear;

    public Queue(){

        this.data = new int[10];
        rear = -1;

    }

    private boolean isFull(){
        return rear == data.length-1;
    }

    public void enqueue(int element){

        if(isFull()){
            return;
        }

        data[++rear] = element;
    }

    public boolean isEmpty(){
        return rear == -1;
    }

    public int deque(){
// 0(n)
        if(isEmpty()){
            return -1;
        }

        int temp =data[0];

        for (int i = 1; i <=rear ; i++) {

            data[i-1]=data[i];
        }

        rear--;
        return temp;
    }

}
