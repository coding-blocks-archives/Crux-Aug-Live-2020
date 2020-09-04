package com.company.Lec9;

public class StringBuildereg {

    public static void main(String[] args) {


        String s = "HeLlo";

//        StringBuilder builder = new StringBuilder("hello");
//        for (int i = 0; i <100000000 ; i++) {
//            builder.append("a");
//        }
        System.out.println(Toggle(s));
//        System.out.println(builder.indexOf("a",1));
//
//        System.out.println(builder.reverse());
//        System.out.println(builder.deleteCharAt(1));

//        System.out.println(builder);
    }

    public static StringBuilder Toggle(String str){

        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            if(ch>= 'A' && ch <= 'Z'){

                ch= (char)('a'+ (ch-'A'));
            }

            else{

                ch =(char)('A' + (ch-'a'));
            }

            builder.setCharAt(i,ch);
        }

        return builder;
    }
}
