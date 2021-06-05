/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package ex14.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double amount = input.nextDouble();
        input.nextLine();

        System.out.print("What is the state? ");
        String state = input.nextLine();

        Tax tax = new Tax(amount);
        System.out.println(tax.stateTax(state));


    }
}