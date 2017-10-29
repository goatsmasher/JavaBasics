package com.udemy;
/*
User: Joshua Parsels
Date: 10/27/2017
Time: 3:12 PM
*/

public class Motherboard {
    private String
            model,
            manufacturer,
            bios;
    private int
            ramSlots,
            cardSlots;

    public Motherboard(String model, String manufacturer, String bios, int ramSlots, int cardSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.bios = bios;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    void loadProgram(String programName) {
        System.out.println("Program " + programName + " is not loaded");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getBios() {
        return bios;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }
}
