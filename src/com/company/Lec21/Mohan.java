package com.company.Lec21;

public class Mohan extends CallODuty{

    // ...

    public static void main(String[] args) {

        int a=11;

        System.out.println(a<<30);

        ShootingGames cod = new CallODuty();
//        cod.hello();

        System.out.println(cod.exp);

        cod.shoot();


//        sum(4,4,4,4,4,4,4,4,4,4,4);
    }

    public static void sum(int a, int ...ar){

        int sum =0;

        for (int i = 0; i <ar.length ; i++) {

            sum = sum + ar[i];
        }

        System.out.println(sum);
    }
}
