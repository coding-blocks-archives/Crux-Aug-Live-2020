package com.company.Lec25_Lec26;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Client {

    public static void main(String[] args) {

        ArrayList<Human> list = new ArrayList<>();
        list.add(new Human(10,"Shubham"));
        list.add(new Human(15,"Avnish"));
        list.add(new Human(5,"Ankur"));

        for (Human h: list) {

            System.out.println(h.age +" " + h.name);

        }

        Collections.sort(list, new Name());

        System.out.println();

        for (Human h: list) {

            System.out.println(h.age +" " + h.name);

        }
    }
}
