package com.company.Lec12;

import java.util.Arrays;

public class Lexopermute {

    public static void main(String[] args) {

        String str = "aaa";

        int[] fre = frequency(str);

        System.out.println(Arrays.toString(fre));

        lexoPermute("", str.length(), fre);
    }

    private static void lexoPermute(String processed, int length, int[] fre) {

        if(length ==0){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i <fre.length ; i++) {

            if(fre[i]>0){

                fre[i]--;
                lexoPermute(processed+ (char)(i+'a'),length-1, fre);
                fre[i]++;
            }
        }
    }

    public static int[] frequency(String str){

        int[] freq = new int[26];

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            freq[ch-'a']++;
        }

        return freq;
    }
}
