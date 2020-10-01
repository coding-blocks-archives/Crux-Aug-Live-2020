package com.company.Lec19;

public class GameLaunch {

    public static void main(String[] args) {

        ShootingGames game1 = new ShootingGames("callofduty");
        ShootingGames game2 = new ShootingGames("Pubg");

        Player p1 =new Player(1, "ShubhamRawat", 0);

        game1.player.add(p1);

    }
}
