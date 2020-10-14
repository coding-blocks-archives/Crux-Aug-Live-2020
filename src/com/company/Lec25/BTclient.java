package com.company.Lec25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BTclient {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("input");
        Scanner s = new Scanner(file);
        BInaryTree tree = new BInaryTree();

        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);

        tree.mirror();
        tree.display();
//        tree.levelorder();
//        System.out.println(tree.height());
//        System.out.println(tree.diameter());
    }
}
