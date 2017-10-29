package com.udemy;

public class Account {
    private int
            accountNumber,
            balance,
            phoneNumber;
    private String
            name,
            emailAddress;

    //Constructors
    public Account() {
        this(21323, 2, 444, "Hello", "yessmam@gmail.com");
    }

    public Account(int accountNumber, int balance, int phoneNumber, String name, String emailAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public Account(int phoneNumber, String name, String emailAddress) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void depositFunds(int amount) {
        if (amount <= 1) {
            System.out.println("Invalid deposit amount");
        } else {
            int newAmount = this.getBalance() + amount;
            this.setBalance(newAmount);
        }
    }

    public void withdrawalFunds(int amount) {
        if (amount <= 1 || amount > this.getBalance()) {
            System.out.println("Cannot complete transaction");
        } else {
            this.setBalance((this.getBalance() - amount));
            System.out.println("Withdrew $" + amount);
        }
        System.out.println("Current balance is: $" + this.getBalance());
    }
}
