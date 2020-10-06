package com.company.Lec20;

public class Stack {

    protected int data[];

    protected int top;

    public Stack() {

        this.data = new int[10];
        this.top = -1;
    }

    protected boolean isFull(){

        return top == data.length-1;
    }

    public void push(int element){

        if(isFull()){
            return;
        }

        data[++top] = element;
    }


    protected boolean isEmpty(){

        return top==-1;
    }

    public int pop() throws MyException{

        if(isEmpty()){

            throw new MyException("khaali he be");

        }

        return data[top--];
    }
}
