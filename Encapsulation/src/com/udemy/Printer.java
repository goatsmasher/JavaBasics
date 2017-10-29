package com.udemy;
/*
User: Joshua Parsels
Date: 10/29/2017
Time: 10:04 AM
*/

public class Printer {
    private int pagesPrinted = 0;
    private double tonerLevel = 100.00;
    private boolean isDuplexPrinter = false;

    public Printer() {
    }

    public Printer(boolean isDuplexPrinter) {
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void printPage() {
        if (!isDuplexPrinter) {
            printSinglePage();
        } else {
            printDuplexPage();
        }
    }

    private void printSinglePage() {
        if (enoughTonerToPrint(1)) {
            System.out.println("Printing single page");
            tonerLevel -= 2.50;
            pagesPrinted += 1;
        } else {
            System.out.println("Not enough toner, please refill");
        }
    }

    private void printDuplexPage() {
        if (enoughTonerToPrint(2)) {
            System.out.println("Printing duplex page");
            tonerLevel -= 5;
            pagesPrinted += 2;
        } else {
            System.out.println("Not enough toner, please refill");
        }
    }

    private boolean enoughTonerToPrint(int pages) {
        return tonerLevel - (2.50 * pages) >= 0;
    }

    public void fillToner() {
        tonerLevel = 100.00;
        System.out.println("Toner has been refilled to 100%");
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }
}
