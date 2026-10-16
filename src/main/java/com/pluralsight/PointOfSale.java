package com.pluralsight;

import java.util.Scanner;

public class PointOfSale {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String userText;

        //Declaring Variables

        //Prices
        double regular;
        double large;
        double total;

        //Initializing Prices
        regular = 5.45;
        large = 8.95;

        //Customer Data
        int age;
        String choice;

        //Customer Prompts

        //Age
        System.out.println("Age: ");
        userText = userInput.nextLine();
        age = Integer.parseInt(userText);

        //Sandwich Size
        System.out.printf("""
                Sizes:
                Regular- %f
                Large- %f
                %n""", regular, large);
        userText = userInput.nextLine();
        choice = userText;

    }

}
