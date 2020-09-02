package com.company.Lec8;

import java.util.Scanner;

public class Multidimesion {

    public static void main(String[] args) {
        
        int[][] ar = { {1,2,3}, {4,5,6}, {7,8,9}};

        Scanner s = new Scanner(System.in);

//        waveprint(ar);

        System.out.println(search(ar,10));
//
//        for (int i = 0; i <ar.length ; i++) {
//
//            for (int j = 0; j <ar[i].length; j++) {
//
//                ar[i][j] = s.nextInt();
//            }
//        }
    }

    public static void waveprint(int[][] ar){

        for (int i = 0; i <ar.length ; i++) {

            if(i%2==0){

                for (int j = 0; j <ar[i].length ; j++) {
                    System.out.println(ar[i][j]);
                }
            }
            else{

                for (int j = ar[i].length-1; j>=0 ; j--) {
                    System.out.println(ar[i][j]);
                }
            }
        }
    }

    public static String search(int[][] ar, int element){

        int i =0;
        int j =ar.length-1;

        while(i < ar.length && j>=0){

            if(ar[i][j]==element){
                return i + " " + j;
            }

            else if(ar[i][j]<element){
                i++;
            }

            else{
                j--;
            }
        }

        return "nhi mila";
    }

}
