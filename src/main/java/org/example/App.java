/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        double total = 0.00;
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        total = input.nextInt();

        input.nextLine();
        System.out.print("What is the state? ");
        String state = input.nextLine();

        if (state.equalsIgnoreCase("WI"))
        {
            System.out.printf("The subtotal is $%.2f.\nThe tax is $0.55.\n", total);
            total = total + 0.55;
        }

        System.out.printf("The total is $%.2f.", total);
    }
}