package com.udemy;
/*
User: Joshua Parsels
Date: 10/27/2017
Time: 2:51 PM
*/

public class Fish extends Animal {

    private int
            gills,
            eyes,
            fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
