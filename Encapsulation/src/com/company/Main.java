package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.name = "phill";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaining());
//
//         damage = 11;
//        player.looseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("phill", 200, "Sword");
        System.out.println("initial health is " + player.getHealth());

    }
}
