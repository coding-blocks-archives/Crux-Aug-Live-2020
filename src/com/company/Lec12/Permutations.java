package com.company.Lec12;

import java.util.*;

public class Permutations {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        String s ="h";
        String s1 ="h";

//        System.out.println(s.compareTo(s1));

        Scanner scn = new Scanner(System.in);
        String st = scn.next();
//        trickypermutations("", st,set);

        ArrayList<String> list = new ArrayList<>();
         Dictionarylarger("",st, list ,st);

        System.out.println(list);
//        for (String str : set) {
//            System.out.println(str);
//        }

    }

    public static void trickypermutations(String processed, String unprocessed, TreeSet<String> set){

        if(unprocessed.isEmpty()){

            set.add(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        for (int i = 0; i <=processed.length() ; i++) {

            String first = processed.substring(0,i);
            String second = processed.substring(i);

            trickypermutations(first+ch+second,unprocessed,set);
        }
    }

    public static void Dictionarylarger(String processed, String unprocessed, ArrayList<String> list, String st){

        if(unprocessed.isEmpty()){

            if(st.compareTo(processed)<0) {
                list.add(processed);

            }
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        for (int i = 0; i <=processed.length() ; i++) {

            String first = processed.substring(0,i);
            String second = processed.substring(i);

            Dictionarylarger(first+ch+second,unprocessed, list, st);
        }
    }

}
