package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    player.health = 20;
//	    player.name = "phill";
//	    player.weapon = "throwing star";
//
//	    int damage = 10;
//
//	    player.looseHealth(damage);
//        System.out.println("remaining health is " + player.healthRemaining());
//
//        damage = 11;
//		player.looseHealth(damage);
//		System.out.println("remaining health is " + player.healthRemaining());

		EnhancedPlayer player = new EnhancedPlayer("phill", 100, "sword");
		System.out.println("initial health is " + player.getHealth());





    }
}
