package com.company.Lec14;

public class Stack {

    private int data[];

    private int top;

    public Stack() {

        this.data = new int[10];
        this.top = -1;
    }

    private boolean isFull(){

        return top == data.length-1;
    }

    public void push(int element){

        if(isFull()){
            return;
        }

        data[++top] = element;
    }


    private boolean isEmpty(){

        return top==-1;
    }

    public int pop() throws MyException{

        if(isEmpty()){

            throw new MyException("khaali he be");

        }

        return data[top--];
    }
}
