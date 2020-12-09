package com.company.Lec28;

import java.util.ArrayList;
import java.util.HashMap;

public class Heaps<T extends Comparable<T>> {

    ArrayList<T> list;

    HashMap<T,Integer>  map = new HashMap<>();

    public Heaps() {
        this.list = new ArrayList<>();
    }


    public void insert(T value){

        list.add(value);

        map.put(value,list.size()-1);

        upheap(list.size()-1);

    }

    private void upheap(int index) {

        if(index==0){
            return;
        }

        int parent = parent(index);

        if(list.get(parent).compareTo(list.get(index))>0){

            swap(parent,index);
            upheap(parent);
        }
    }

    public boolean isEmpty(){

        return list.isEmpty();
    }

    private void swap(int first, int second){

        T temp = list.get(first);

        T temp1 = list.get(second);

        list.set(first,list.get(second));

        list.set(second,temp);

        map.put(temp,second);
        map.put(temp1,first);
    }


    public T delete(){

       swap(0, list.size()-1);

       T temp = list.remove(list.size()-1);

       downheap(0);

       return temp;
    }

    private void downheap(int index) {

        int min = index;

        int left = leftchild(index);

        int right = rightchild(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left))>0){

            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right))>0){

            min=right;
        }

        if(min!=index){

            swap(min,index);

            downheap(min);
        }

    }

    public void update(T value){

        int index = map.get(value);
        upheap(index);
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
