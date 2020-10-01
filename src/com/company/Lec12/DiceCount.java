package com.company.Lec12;

public class DiceCount {

    public static void main(String[] args) {
        dicepath("",4);
    }

    public static void dicepath(String processed, int target){

        if(target==0){
            System.out.println(processed);
            return;
        }


        for (int i = 1; i <=6 && i<=target ; i++) {

            dicepath(processed+i, target-i);
        }
    }

}
