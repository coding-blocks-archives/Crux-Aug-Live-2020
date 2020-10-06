package com.company.Lec22;

public class LLclient {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);

        list.insertlast(5);
        list.insertlast(6);

//        System.out.println(list.delete());
////
//        list.insertatindex(1,24);
//        list.insertatindex(0,51);
//
//        list.insertfirst(41);
//
//        list.insertatindex(8,81);
//        list.insertlast(92);

//        System.out.println(list.deleteatindex(1));

        list.reverse();
        list.display();


    }
}
