package com.company.Lec19;

import java.util.ArrayList;

public class ShootingGames {

    String gamename;
//    final int playerid ;
//
//    String playerName;
//
//    int level;

    ArrayList<Player> player = new ArrayList<>();

    static int weenemyhealth =999999999;

    int exp;

    public ShootingGames(String gamename) {
//        this.playerid = playerid;
//        this.playerName = playerName;
//        this.level = level;
        this.gamename=gamename;
    }

    public void shoot(){
        System.out.println("shoot");
    }

    public void levelcheck(){

        if(exp>1000){

            levelup();
            exp=0;
            return;
        }

        System.out.println("abhi nhi hua");
    }

    public static void wordevent(){
        System.out.println("shuru ho gya");
    }
    private void levelup() {

        System.out.println("bad gya finally");
    }

    public void revive(){
        System.out.println("revive de bhai");
    }
}
