package com.company.Lec29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class MapClient {

    public static void main(String[] args) {

//        HashMap<String,String> map = new HashMap<>();

//        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        TreeMap<String, String> map = new TreeMap<>();

//        map.put(, "accha he");
        map.put(null,null);
        map.put(null, "hu");
        map.put("Aalooo", "kuch bhi");

        for (String str:map.keySet()) {

            System.out.println(str);
        }
//
        for (String str:map.values()) {
            System.out.println(str);
        }

//        System.out.println(occurence("Hhhhhhhello"));
    }

    public static HashMap<Character,Integer> occurence(String str){

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            if(map.containsKey(ch)){

                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        return map;
    }
}
