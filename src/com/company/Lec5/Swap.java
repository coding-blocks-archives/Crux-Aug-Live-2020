package com.company.Lec5;

public class Swap {

    public static void main(String[] args) {
        int a=5;
        int b=7;

//        int[] ar = new int[10];


        int[] ar= {1,2,3};

        System.out.println(ar[0] +" " +ar[1]);
        swap(ar);
        System.out.println(ar[0] +" " +ar[1]);


    }

    public static void swap(int[] br){

        int temp =br[0];
        br[0]=br[1];
        br[1]=temp;
    }
}

