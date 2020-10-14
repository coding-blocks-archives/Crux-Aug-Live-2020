package com.company.Lec25;

public class BSTclient {

    public static void main(String[] args) {

        BST tree = new BST();

        tree.insert(5);
        tree.insert(3);
        tree.insert(1);
        tree.insert(4);
        tree.insert(11);

        tree.display();
    }
}
