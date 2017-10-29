package com.udemy;
/*
User: Joshua Parsels
Date: 10/29/2017
Time: 9:49 AM
*/

public class Player {
    public String
            name,
            weapon;
    public int health;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health < 0) {
            System.out.println("player knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}