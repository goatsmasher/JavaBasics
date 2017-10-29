package com.udemy;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220b", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("24 inch Beast", "Asus", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("02-30202", "Asus", "2.44", 4, 4);

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }
}
