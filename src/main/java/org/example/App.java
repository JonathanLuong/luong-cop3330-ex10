package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        final float tax = 0.055f;

        System.out.printf("Enter the price of item 1: ");
        String item1 = reader.nextLine();
        System.out.printf("Enter the quantity of item 1: ");
        String quant1 = reader.nextLine();

        System.out.printf("Enter the price of item 2: ");
        String item2 = reader.nextLine();
        System.out.printf("Enter the quantity of item 2: ");
        String quant2 = reader.nextLine();

        System.out.printf("Enter the price of item 3: ");
        String item3 = reader.nextLine();
        System.out.printf("Enter the quantity of item 3: ");
        String quant3 = reader.nextLine();


        int i1 = Integer.parseInt(item1);
        int i2 = Integer.parseInt(item2);
        int i3 = Integer.parseInt(item3);
        int q1 = Integer.parseInt(quant1);
        int q2 = Integer.parseInt(quant2);
        int q3 = Integer.parseInt(quant3);

        float subtotal = (i1 * q1) + (i2 * q2) + (i3 * q3);
        float subTax = subtotal * tax;
        float total = subtotal + subTax;


        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", subTax);
        System.out.printf("Total: $%.2f", total);

    }
}