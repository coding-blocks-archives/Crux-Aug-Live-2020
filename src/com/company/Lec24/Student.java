package com.company.Lec24;

public interface Student {

    void teach(int a);

    void bunk();

    void party();

    default void fun(){
        System.out.println("mze hi mze");
    }

    public static void main(String[] args) {


        System.out.println("hi");
    }
}
