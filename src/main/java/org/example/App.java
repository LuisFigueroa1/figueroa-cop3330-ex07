package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 07 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App
{
    public static void main( String[] args ) //main function
    {
        Scanner userInput = new Scanner(System.in);

        //declare the variables that will be used
        String length; //current age
        String width; //retirement age

        System.out.println("What is the length of the room in feet? "); //prompt current age input
        length = userInput.nextLine(); //scan the input
        System.out.println( "What is the width of the room in feet? " ); //prompt retirement age input
        width = userInput.nextLine();

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.\nThe area is");

        //change into integers
        int lengthInt = Integer.parseInt(length);
        int widthInt = Integer.parseInt(width);

        int f2 = lengthInt * widthInt; //feet squared area calculation
        double m2 = f2 * 0.09290304; //meter squared area calculation

        //print output
        System.out.println(f2 + " square feet\n" + m2 + " square meters");
    }
}