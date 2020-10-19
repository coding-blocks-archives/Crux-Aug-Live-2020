package com.company.Lec25_Lec26;

import java.util.HashMap;

public class BSTclient {

    public static void main(String[] args) {

        BSTGeneric<String> tree = new BSTGeneric<>();

//
        tree.insert("abc");
        tree.insert("aba");
        tree.insert("abd");
        tree.insert("abe");
//        tree.insert(11);
//
//        int[] ar = {1,2,3,4,5,6,7};
//        System.out.println(tree.successor(3));
//        tree.makefromsorted(ar,0,ar.length-1);

//        int[] pre= {5,2,1,3,15};
//        int[] in ={1,2,3,5,15};
//
//        tree.preandin(pre,in);
        tree.display();

//        tree.inrange(3,21);
    }
}
