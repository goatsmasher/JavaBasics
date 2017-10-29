package com.udemy;

public class VIPCustomer {

    //Class Variables

    private String
            name,
            emailAddress;

    private int creditLimit;

    //Constructors

    public VIPCustomer() {
        this("Josh", "joshparsels@gmail.com", 9999999);
    }

    public VIPCustomer(String name, String emailAddress) {
        this(name, emailAddress, 10000);
    }

    public VIPCustomer(String name, String emailAddress, int creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
