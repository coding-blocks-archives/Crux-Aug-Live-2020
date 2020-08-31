package com.company.Lec6;

public class ArrayEg {

    public static void main(String[] args) {

        int[] ar ={1,2,3,4,5};

        System.out.println(ar[0] + " " + ar[1]);

        swap(ar, 0 , ar[1]);

        System.out.println(ar[1] + " " + ar[2]);

    }

    public static void swap(int[] ar, int first, int second){

        int temp= ar[first];
        ar[first]=ar[second];
        ar[second]=temp;
    }
}
