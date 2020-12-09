package com.company.Lec32;

import java.util.Scanner;

public class FiboDp {

    static int[] mem;

    public static void main(String[] args) {

        int n =4;

        System.out.println(fibo(n));
//        System.out.println(fiboRecDp(n,mem));
        System.out.println(fiboItrDp(n,mem));
    }

    public static int fibo(int n){

        if(n<2){
            return n;
        }

        return fibo(n-1) +fibo(n-2);
    }

    public static int fiboRecDp(int n, int[] mem) {

        if (n < 2) {
            return n;
        }

        if (mem[n] != 0) {
            return mem[n];
        }

        mem[n] = fiboRecDp(n - 1, mem) + fiboRecDp(n - 2, mem);

        return mem[n];

    }

    public static int fiboItrDp(int n ,int[] mem){

        mem[0]=0;
        mem[1]=1;


        for (int i = 2; i <=n ; i++) {

        mem[i]= mem[i-1] +mem[i-2];

        }

        return mem[n];
    }
}
