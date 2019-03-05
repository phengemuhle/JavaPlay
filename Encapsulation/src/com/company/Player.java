package com.company;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void looseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <=0){
            System.out.println("player out");
        }
    }

    public int healthRemaining () {
        return this.health;
    }

}
