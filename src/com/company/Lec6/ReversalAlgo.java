package com.company.Lec6;

import java.util.Arrays;

public class ReversalAlgo {

    public static void main(String[] args) {

        int[] ar ={1,2,3,4,5};
        int factor = 3;

        ArrayQuestion.reverse(ar,0,factor-1);
        System.out.println(Arrays.toString(ar));

        ArrayQuestion.reverse(ar,factor,ar.length-1);
        System.out.println(Arrays.toString(ar));

        ArrayQuestion.reverse(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));

    }
}
