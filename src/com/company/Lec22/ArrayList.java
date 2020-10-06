package com.company.Lec22;

import java.util.Arrays;

public class ArrayList {

    private int data[];
    int size ;

    public ArrayList() {
        this.data = new int[10];
        this.size =0;
    }

    public void add(int element){

        if(isFull()){
            resize();
            return;
        }

        data[size++] = element;
    }

    private void resize() {

        System.out.println("me badh gya");
        int[] ar = new int[2*data.length];

        for (int i = 0; i <data.length ; i++) {

            ar[i]= data[i];
        }

        data = ar;

    }

    private boolean isFull() {

        return size==data.length;
    }

    public int get(int index){

        return data[index];
    }

    public int remove(){

        if(isEmpty()){
            return -1;
        }

        return data[--size];
    }

    private boolean isEmpty() {

        return size==0;
    }

    public void display(){
        System.out.println(Arrays.toString(data));
    }
}
