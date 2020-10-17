package com.company.Lec25_Lec26;

import java.util.Scanner;

public class GTclient {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        GenericTrees tree = new GenericTrees();

        tree.insert(s);
//        tree.display();
//        System.out.println(tree.count());
        System.out.println(tree.max());
        tree.atlevel(2);

    }
}
