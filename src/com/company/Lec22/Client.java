package com.company.Lec22;

public class Client {

    public static void main(String[] args) throws Exception{


        DynamicQueue queue = new DynamicQueue();

        for (int i = 0; i <50 ; i++) {

            queue.enqueue(i);
        }

        for (int i = 0; i <50 ; i++) {
            System.out.println(queue.deque());
        }

    }
}
