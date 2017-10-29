package com.udemy;
/*
User: Joshua Parsels
Date: 10/27/2017
Time: 1:29 PM
*/

public class Dog extends Animal {

    private int
            eyes,
            legs,
            tail,
            teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog's override of eating");
    }

    public void walk() {
        System.out.println("Dog is walking");
        move(5);
    }

    public void run() {
        System.out.println("Dog is running");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Override of move was called");
        super.move(speed);
    }
}
