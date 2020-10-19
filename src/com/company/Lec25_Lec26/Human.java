package com.company.Lec25_Lec26;

import java.util.Comparator;

public class Human {

    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }


}

class Name implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {
        return o1.name.compareTo(o2.name);
    }
}
