package com.udemy;

public class Main {

    public static void main(String[] args) {
        Printer printer1 = new Printer();
        Printer printer2 = new Printer(true);
        printer1.printPage();
        printer1.printPage();
        System.out.println(printer1.getPagesPrinted());
        printer2.printPage();
        System.out.println(printer2.getPagesPrinted());
        System.out.println(printer2.getTonerLevel());
        printer2.fillToner();
        System.out.println(printer2.getTonerLevel());
    }
}
