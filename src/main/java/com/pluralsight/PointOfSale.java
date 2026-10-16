package com.pluralsight;

import java.util.Scanner;

public class PointOfSale {

    public static void main(String[] args) {

        //Scanner $#@!
        Scanner userInput = new Scanner(System.in);
        String userText;
        String userYoN;
//---------------------------------------Declaring Variables-------------------------------------------
        //Prices
        double regular;
        double large;
        double total;
        double loadedR;
        double loadedL;

        //Customer Data
        int age;
        double choice;
        boolean loaded;

        //Initializing Prices
        regular = 5.45;
        large = 8.95;
        total = 0;
        choice = 0;
        age = 0;
        loaded = false;
        loadedR = 1.00;
        loadedL = 1.75;
//-----------------------------------------Customer Prompts--------------------------------------------------
        //Age
        System.out.print("Age: ");
        userText = userInput.nextLine();
        age = Integer.parseInt(userText);

        //Sandwich Size
        System.out.printf("""
                Sizes:
                (R)egular - %.2f
                (L)arge - %.2f
                Choice:\t""", regular, large);
        userText = userInput.nextLine();
        //Sandwich Load
        System.out.println("""
                Load Sandwich?
                (Y)es/(N)o""");
        userYoN = userInput.nextLine();
//-------------------------------------------Customer Choices LOGIC-----------------------------------------
        //LOADED
        if (userYoN.equals("Y")){
            loaded = true;
        }
        //Size
        if (userText.equals("R")) {
            if (loaded) {
                choice = loadedR;
            }
            choice = choice + regular;
        }
        else {
            if (userText.equals("L")){
                if (loaded) {
                    choice = loadedL;
                }
                choice = choice + large;
            }
            else {
                choice = 0.0;
            }
        }//CHOICE IF END
//-------------------------------------------MATH--------------------------------------------------------
        //Total Cost
        if (choice <= 0) {
            System.out.println("Order Canceled");
        }
        else {
            if (age <= 17) {
                total = choice * 0.9;
            }
            else {
                if (age >= 65) {
                    total = choice * 0.8;
                }
                else {
                    total = choice;
                }
            }
        }
//-----------------------------------------Prints------------------------------------------------------
        //Print Total
        if (choice > 0) {
            System.out.printf("\n----- BILL -----\n%.2f", total);
        }
//--------------------------------------------------------------------------------------------------------
    }//MAIN END
//--------------------------------------------------------------------------------------------------------
}//POS CLASS END
