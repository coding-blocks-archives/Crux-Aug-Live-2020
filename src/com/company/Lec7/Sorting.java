package com.company.Lec7;

import com.company.Lec6.ArrayEg;
import com.company.Lec6.ArrayQuestion;

import java.util.Arrays;

public class Sorting {


    public static void main(String[] args) {

        int[] ar = {5,4,3,9,8,2,1};

        System.out.println(Arrays.toString(ar));
        insertion(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void bubblesort(int[] ar){


        for (int i = 0; i <ar.length ; i++) {

            for (int j = 0; j <ar.length-i-1 ; j++) {

                if(ar[j]>ar[j+1]){

                    ArrayEg.swap(ar,j,j+1);
                }
            }
        }
    }

    public static void selection(int[] ar){

        for (int i = 0; i <ar.length ; i++) {

           int max= ArrayQuestion.maxindex(ar,0,ar.length-i-1);

           ArrayEg.swap(ar,max,ar.length-i-1);

        }
    }

    public static void insertion(int[] ar){

        for (int i = 0; i <ar.length-1 ; i++) {

            for (int j = i+1; j>0 ; j--) {

                if(ar[j]<ar[j-1]){

                    ArrayEg.swap(ar,j,j-1);
                }

                //when sorted will take linear time

                else{
                    break;
                }

            }
        }
    }
}
