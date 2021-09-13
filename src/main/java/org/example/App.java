package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner askLengthFeetS = new Scanner(System.in);
        System.out.println("Room length in feet? ");

        String inputLengthFeetS = askLengthFeetS.nextLine();
        if (inputLengthFeetS.isEmpty()) {
            System.out.println("Room length is required!");
        } else {
            double inputLengthFeet = parseInt(inputLengthFeetS);
            Scanner askWidthFeetS = new Scanner(System.in);
            System.out.println("Room width in feet? ");
            String inputWidthFeetS = askWidthFeetS.nextLine();
            if (inputWidthFeetS.isEmpty()) {
                System.out.println("Room width is required!");
            } else {
                double inputWidthFeet = parseInt(inputWidthFeetS);
                double conversionRate = 350;
                double squareFootage = inputLengthFeet * inputWidthFeet;
                double paintGallons = Math.ceil(squareFootage / conversionRate);
                System.out.println("You will need to purchase " + paintGallons + " gallons of paint to cover " + squareFootage + " square feet.");
            }
        }
    }
}
