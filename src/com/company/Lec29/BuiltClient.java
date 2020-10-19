package com.company.Lec29;

import java.util.HashMap;

public class BuiltClient {

    public static void main(String[] args) {

        HashMapAL<Character, Integer> map = new HashMapAL<>();

        for (int i = 0; i <12 ; i++) {

            map.put((char)('a'+i),i);
        }

        System.out.println(map.remove((char)('a'+2)));

        for (int i = 0; i <12 ; i++) {
            System.out.println(map.get((char)('a'+i)));
        }

    }
}
