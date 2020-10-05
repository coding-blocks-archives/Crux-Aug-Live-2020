package com.company.Lec20;

import com.company.Lec21.CallODuty;
import com.company.Lec21.ShootingGames;

public class StackClient {

    public static void main(String[] args) throws  Exception{

        Stack stack = new Stack();

        ShootingGames games = new ShootingGames();


//        StackClient stackClient = new StackClient();
////        stackClient.
//
//        CallODuty cod = new CallODuty();
//        cod.

        stack.push(1);
        stack.push(2);
        stack.push(3);

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(stack.pop());
            }
        }


        finally {

            System.out.println("hello");
        }



        //func1
        //func2
        //func3
        //func4

        //func5
        //func6

    }

}
