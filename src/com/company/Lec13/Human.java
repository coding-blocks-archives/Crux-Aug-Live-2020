package com.company.Lec13;

 class Human {

    int hands;
    int nose;
    int eyes;
     String name;
     int balance;


     public Human(){

         this("Anonymous");
         this.hands =2;
//        this.nose=1;
//        this.eyes =2;
     }


     public Human(String name){
        this(name,2);
    }

    public Human(String name, int hands){

        this.name=name;
        this.hands=hands;
    }

//     public Human(Human old){
//
//         this.name =old.name;
//         this.nose= old.nose;
//     }

//    public void eat(){
//
//        System.out.println("eat");
//    }

    public void hello(int balance){

        this.balance =this.balance-balance;
    }

    public static void fest(){

        System.out.println("hurray hurray");

//        loan();
    }

    public void loan(){

        balance = balance - 99999999;

        System.out.println("hayee me gareeb ho gya "+ balance);

        fest();
    }

    public void eat(){

        if(balance<10000){
            System.out.println("bhagg ja");
        }

        balance =balance-9999999;
    }


}

//class Pablo{
//
//
//}
