package com.pluralsight;

import java.util.Scanner;

public class PointOfSale {

    public static void main(String[] args) {

        //Scanner $#@!
        Scanner userInput = new Scanner(System.in);
        String userText;
//---------------------------------------Declaring Variables-------------------------------------------
        //Prices
        double regular;
        double large;
        double total;

        //Initializing Prices
        regular = 5.45;
        large = 8.95;
        total = 0;

        //Customer Data
        int age;
        double choice;
//-----------------------------------------Customer Prompts--------------------------------------------------
        //Age
        System.out.print("Age: ");
        userText = userInput.nextLine();
        age = Integer.parseInt(userText);

        //Sandwich Size
        System.out.printf("""
                Sizes:
                Regular - %.2f
                Large - %.2f
                Choice:\t""", regular, large);
        userText = userInput.nextLine();
        if (userText.equals("Regular")) {
            choice = regular;
        }
        else {
            if (userText.equals("Large")){
                choice = large;
            }
            else {
                choice = 0.0;
            }
        }//CHOICE IF END
//-------------------------------------------MATH--------------------------------------------------------
        //Price Math
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
