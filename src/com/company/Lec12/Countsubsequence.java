package com.company.Lec12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Countsubsequence {

    public static void main(String[] args) {

//        int cnt=subsequencecnt("","abcd");
//
//        ArrayList<String> list = new ArrayList<>();

        HashSet<String> set = new HashSet();


//        subsequeneList("","abc",list);
        ArrayList<String> list = subsequeneListinside("","abc");
        Collections.sort(list);


        for (int i = 0; i <list.size() ; i++) {

            System.out.print(list.get(i) + " ");
        }

    }
    public static int subsequencecnt(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.print(processed + " ");
            return 1;
        }

        int cnt=0;

        char ch = unprocessed.charAt(0);

        unprocessed=unprocessed.substring(1);

        cnt += subsequencecnt(processed,unprocessed);
         cnt+=subsequencecnt(processed+ch,unprocessed);


        return cnt;
    }

    public static void subsequeneList(String processed, String unprocessed, ArrayList<String> list){

        if(unprocessed.isEmpty()){
            list.add(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        unprocessed=unprocessed.substring(1);

        subsequeneList(processed,unprocessed,list);
        subsequeneList(processed+ch,unprocessed,list);
    }

    public static ArrayList<String> subsequeneListinside(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        char ch = unprocessed.charAt(0);

        unprocessed=unprocessed.substring(1);

        list.addAll(subsequeneListinside(processed,unprocessed));
        list.addAll(subsequeneListinside(processed+ch,unprocessed));

        return list;
    }




}
