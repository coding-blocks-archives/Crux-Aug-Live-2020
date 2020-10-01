package com.company.Lec20;

public class StackClient {

    public static void main(String[] args) throws  Exception{

        Stack stack = new Stack();

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
