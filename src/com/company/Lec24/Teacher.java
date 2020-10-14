package com.company.Lec24;

public interface Teacher {

   int a =6;

  default void fun(){
        System.out.println(a);
    }

    void teach();

    void study();

    void assignment();

}