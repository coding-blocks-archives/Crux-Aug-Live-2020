package com.company.Lec6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuestion {

    public static void main(String[] args) {

        int[] ar = new int[5];

        Scanner s = new Scanner(System.in);


        for (int i = 0; i <ar.length ; i++) {

            ar[i]=s.nextInt();
        }


//        for (int i = 0; i <ar.length ; i++) {
//
//            System.out.println(ar[i]);
//        }

//        max(ar);
    }


    //nlogn
    public static void max(int[] ar){

        Arrays.sort(ar);

        System.out.println(ar[ar.length-1]);
    }

    public static int maxindex(int[] ar, int start, int end){

        int max = start;

        for (int i = 1; i <=end ; i++) {

            if(ar[i]>ar[max]){
                max=i;
            }
        }

        return max;
    }





    public static void reverse(int[] ar, int from, int to){

      while(from<to){

          ArrayEg.swap(ar,from,to);

          from=from+1;
          to=to-1;
      }
    }

}
