package com.company.Lec28;

import java.util.ArrayList;

public class Heaps {

    ArrayList<Integer> list;

    public Heaps() {
        this.list = new ArrayList<>();
    }


    public void insert(int value){

        list.add(value);
        upheap(list.size()-1);
    }

    private void upheap(int index) {

        if(index==0){
            return;
        }

        int parent = parent(index);

        if(list.get(parent)>list.get(index)){

            swap(parent,index);
            upheap(parent);
        }
    }

    private void swap(int first, int second){

        int temp = list.get(first);

        list.set(first,list.get(second));

        list.set(second,temp);
    }


    public int delete(){

        if(list.isEmpty()){
            System.out.println("khaali he be");
            return -1;
        }

        int temp= list.get(0);

        list.set(0, list.remove(list.size()-1));

        if(!list.isEmpty()){
            downheap(0);
        }

        return temp;
    }

    private void downheap(int index) {

        int min = index;

        int left = leftchild(index);

        int right = rightchild(index);

        if(left < list.size() && list.get(min) > list.get(left)){

            min = left;
        }

        if(right < list.size() && list.get(min) > list.get(right)){

            min=right;
        }

        if(min!=index){

            swap(min,index);

            downheap(min);
        }

    }

    private int parent(int index){
        return (index-1)/2;
    }

    private int leftchild(int index){
        return 2*index+1;
    }

    private int rightchild(int index){
        return 2*index+2;
    }

    public void display(){
        System.out.println(list);
    }
}
