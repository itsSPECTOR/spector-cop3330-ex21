package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 21 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        // initialize output string
        String output = "";

        // get month number
        System.out.print("Please enter the number of the month: ");
        String monthNum = input.nextLine();
        int numInput = Integer.parseInt(monthNum);

        // switch for month
        switch (numInput){
            case 1:
                output = "January"; break;
            case 2:
                output = "February"; break;
            case 3:
                output = "March"; break;
            case 4:
                output = "April"; break;
            case 5:
                output = "May"; break;
            case 6:
                output = "June"; break;
            case 7:
                output = "July"; break;
            case 8:
                output = "August"; break;
            case 9:
                output = "September"; break;
            case 10:
                output = "October"; break;
            case 11:
                output = "November"; break;
            case 12:
                output = "December"; break;
            default: break;
        }

        //output
        System.out.print("The name of the month is " + output + ".");

    }
}