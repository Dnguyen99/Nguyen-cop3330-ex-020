/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dylan Nguyen
 */

package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        int amount = scan.nextInt();
        System.out.print("What state do you live in? ");
        String state = scan.next();

        double tAmount = 0.0;
        double tax = 0.0;
        if(state.equals("Wisconsin")) {
            System.out.print("What county do you live in? ");
            String county = scan.next();
            if(county.equals("Dunn")) {
                tax = (amount * 5.004) / 100;
                tAmount = tax + amount;
            }
            else if(county.equals("Eau Claire")) {
                tax = (amount * 5.005) / 100;
                tAmount = tax + amount;
            }
            else {
                System.out.println("Please enter correct county.");
            }
            }
        else if(state.equals("Illinois")) {
            tax = (amount * 8.00) / 100;
            tAmount = tax + amount;
        }
        else {
            tax = 0.0;
            tAmount = amount;
        }
        System.out.println("The tax is $" +String.format("%.2f", tax));
        System.out.println("The total is $" +String.format("%.2f", tAmount));
    }
}
