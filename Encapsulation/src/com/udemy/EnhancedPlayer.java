package com.udemy;
/*
User: Joshua Parsels
Date: 10/29/2017
Time: 9:55 AM
*/

public class EnhancedPlayer {
    private String
            name,
            weapon;
    private int hitPoints = 100;

    public EnhancedPlayer(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints < 0) {
            System.out.println("player knocked out");
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
