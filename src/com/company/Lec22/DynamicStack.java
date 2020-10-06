package com.company.Lec22;

import com.company.Lec20.Stack;

public class DynamicStack extends Stack {

    @Override
    public void push(int element) {

        if(isFull()){

            System.out.println("badh gya");
            int[] ar = new int[2*data.length];

            for (int i = 0; i <data.length ; i++) {

                ar[i]= data[i];
            }

            data = ar;

        }

        super.push(element);
    }
}
