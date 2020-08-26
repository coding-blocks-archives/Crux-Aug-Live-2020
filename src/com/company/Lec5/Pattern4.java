package com.company.Lec5;

import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row=1;

        int k=1;

        int p = (n+2)/2 +1;

        while(k<=n){

            int col=1;
            int side=1;

            while(side<=n+2){

                if(col>=p){
                    System.out.print(" " + "\t");
                }
                else{
                    System.out.print("*"+ "\t");
                }

                if(side<(n+2)/2 +1){
                    col=col+1;
                }
                else{
                    col =col-1;
                }

                side=side+1;
            }

            System.out.println();
            if(k< n/2+1){
                row=row+1;
                p=p-1;
            }
            else{
                row =row-1;
                p=p+1;
            }

            k=k+1;
        }
    }
}
