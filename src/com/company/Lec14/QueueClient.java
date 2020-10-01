package com.company.Lec14;

public class QueueClient {

    public static void main(String[] args) {

        CircularQueue queue =  new CircularQueue();

        for (int i = 0; i <10 ; i++) {

          queue.enqueue(i);
        }

        System.out.println(queue.deque());

        queue.enqueue(15);

//        for (int i = 0; i <10 ; i++) {
//            System.out.println(queue.deque());
//        }
        queue.display();


    }


}
