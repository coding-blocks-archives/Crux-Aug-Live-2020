package com.company.Lec9;

import java.util.Arrays;

public class Questions {

    public static void main(String[] args) {

        String str = "hello";

//        substringgen(str);

        int[] fre = freq(str);

        for (int i = 0; i <fre.length ; i++) {

            if(fre[i]>0){

                System.out.println((char)(i+'a') + "->"+ fre[i]);
            }
        }
    }

    public static void substringgen(String str){

        for (int i = 0; i <str.length() ; i++) {

            for (int j = i+1; j <=str.length() ; j++) {

                System.out.println(str.substring(i,j));
            }
        }
    }

    public static int[] freq(String str){

        int[] freq = new int[26];

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            freq[ch-'a']++;
        }

        return freq;
    }

//    public static boolean pallin(String str){
//
//
//      discussed
//
//    }
}
