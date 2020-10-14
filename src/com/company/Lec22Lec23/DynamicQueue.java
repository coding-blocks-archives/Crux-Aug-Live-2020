package com.company.Lec22Lec23;

import com.company.Lec20.CircularQueue;

public class DynamicQueue extends CircularQueue {

    @Override
    public void enqueue(int element) {

        if(isFull()){

            int[] ar = new int[2*data.length];

            for (int i = 0; i <data.length ; i++) {

                ar[i]= data[(front+i)%data.length];
            }

            front=0;

            rear= data.length;

            data = ar;

        }
        super.enqueue(element);
    }
}
