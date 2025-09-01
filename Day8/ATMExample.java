package com.codegnan.controlStmts;

import java.util.Scanner;

public class ATMExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double balance = 50000;
        int originalPin = 1234;
        int enteredPin;

        System.out.println("Enter your PIN:");
        enteredPin = s.nextInt();

        if (enteredPin != originalPin) {
            System.out.println("Incorrect PIN");
            return;  // exit if wrong pin
        }

        int choice;
        do {
            System.out.println("\n====== ATM Menu =======");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = s.nextDouble();
                    if (depositAmount % 100 != 0) {
                        System.out.println("Please deposit multiples of 100");
                    } else if (depositAmount < 500) {
                        System.out.println("Please deposit at least 500");
                    } else {
                        balance += depositAmount;
                        System.out.println("Deposited " + depositAmount +
                                " successfully. Updated balance: " + balance);
                    }
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmount = s.nextDouble();
                    if (withdrawAmount % 100 != 0) {
                        System.out.println("Withdraw multiples of 100 only");
                    } else if (withdrawAmount < 500) {
                        System.out.println("Minimum withdraw amount is 500");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds...");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawn " + withdrawAmount +
                                " successfully. Updated balance: " + balance);
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 4);  
    }
}
