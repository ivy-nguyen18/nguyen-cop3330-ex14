/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package ex14.base;

public class Tax {
    private double amount;
    static final double WI_TAX = 5.5 / 100;

    public Tax(double amount){
        this.amount = amount;
    }

    public StringBuilder stateTax(String state2){

        StringBuilder output = new StringBuilder();

        if("WI".equals(state2)){
            output.append(String.format("The subtotal is $%.2f.%nThe tax is $%.2f.%n", amount, amount * WI_TAX));
            amount += amount * WI_TAX;
        }

        output.append(String.format("The total is $%.2f.", amount));

        return output;
    }
}
