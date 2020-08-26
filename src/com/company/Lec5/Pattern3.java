package com.company.Lec5;


import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {

       int a=3;
       int b=2;

      int n= Methods.adder(a,b);

        int row =1;

        int k = 1 ;

        while(k<=2*n-1){

            int col =1;

            int side =1;

            while(side<=2*n-1){

                if(col<=row){
                    System.out.print("*"+"\t");
                }
                else{
                    System.out.print(" "+"\t");
                }

                if(side<n){

                    col=col+1;
                }
                else{
                    col =col-1;
                }

                side =side+1;
            }

            System.out.println();

            if(k<n){
                row=row+1;
            }
            else{
                row=row-1;
            }
            k=k+1;
        }
    }
}
