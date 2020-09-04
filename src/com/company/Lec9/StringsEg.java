package com.company.Lec9;

public class StringsEg {

    public static void main(String[] args) {


        String str ="";

//        str = str+"hello";

//        String str1 = "hello";

//        System.out.println(str==str1);

//        System.out.println(str.length());
//
//        System.out.println(str);
//
//        System.out.println(str.charAt(0));
//
//        System.out.println(str.hashCode());
//
//        System.out.println(str.strip());
//
//        System.out.println(str.trim());
//
//        System.out.println(str.substring(2,4));
//
//        System.out.println(str.subSequence(2,5));
//
//        System.out.println(str.codePointAt(0));

        findoccurence(str,'l');

    }


    public static void findoccurence(String str, char ch){

        int index = 0;

        while(true){

            index = str.indexOf(ch,index);

            if (index == -1) {

                break;
            }

            System.out.println(index);
            index=index+1;

        }
    }
}
