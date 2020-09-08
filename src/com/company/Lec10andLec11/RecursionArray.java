package com.company.Lec10andLec11;

import com.company.Lec6.ArrayEg;

public class RecursionArray {

    public static void main(String[] args) {

        int[] ar = {3,2,1,2,3};

//        allindices(ar,0,2);
//        pattern(4,0);


    }

    public static boolean isSorted(int[] ar , int index) {

        if (index == ar.length - 1) {
            return true;
        }

        if (ar[index] > ar[index + 1]) {
            return false;
        }

        return isSorted(ar, index + 1);
    }


    public static boolean linearSearch(int[] ar, int index, int element){

        if(index== ar.length){
            return false;
        }

        if(ar[index]==element){
            return true;
        }

        return linearSearch(ar,index+1,element);
    }

    public static void allindices(int[] ar, int index, int element){

        if(index== ar.length){
            return;
        }

        if(ar[index]==element){
            System.out.println(index);
        }

        allindices(ar,index+1,element);
    }

    public static void pattern(int row, int col) {

        if (row == 0) {
            return;
        }

        if (row == col) {
            pattern(row - 1, 0);
            System.out.println();
            return;
        }

        pattern(row, col + 1);
        System.out.print("*" + "\t");
    }

    public static void bubblesort(int[] ar, int row, int col){

        if (row == 0) {
            return;
        }

        if (row == col) {
            bubblesort(ar,row - 1, 0);
            return;
        }

        if(ar[col]>ar[col+1]){
            ArrayEg.swap(ar,col,col+1);
        }

        bubblesort(ar,row, col + 1);

    }
}
