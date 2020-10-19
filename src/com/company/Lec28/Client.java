package com.company.Lec28;

public class Client {

    public static void main(String[] args) {

        Heaps heap = new Heaps();
        heap.insert(15);
        heap.insert(10);
        heap.insert(5);
        heap.insert(2);

        heap.insert(1);

        System.out.println(heap.delete());
        System.out.println(heap.delete());
        System.out.println(heap.delete());

        heap.display();
    }
}
