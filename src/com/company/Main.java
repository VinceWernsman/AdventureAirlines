package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Welecome info
        System.out.println("Welcome to Adventure Airlines please select a number corresponding with your" +
                " class flight: 1 = First Class, 2 = Business Class, or 3 = Economy Class");

                Scanner myScanner = new Scanner(System.in);
        int userClassSelection = myScanner.nextInt();


        String [] firstClassSeat = {"1A", "1B", "1C", "2A", "2B", "2C","3A", "3B", "3C"};
        String [] businessClassSeat = {"4A", "4B", "4C", "5A", "5B", "5C","6A", "6B", "6C"};
        String [] economyClassSeat  = {"7A", "7B", "7C", "8A", "8B", "8C","9A", "9B", "9C"};

        Random random = new Random(System.currentTimeMillis());

        System.out.println("testing");


    if (userClassSelection == 1) {System.out.println("Thank you for selecting First Class, your seat number is " +
            firstClassSeat[random.nextInt(9)] + ".");}
    if (userClassSelection == 2) {System.out.println("Thank you for selecting Business Class, your seat number is " +
            businessClassSeat[random.nextInt(9)] + ".");}
    if (userClassSelection == 3) {System.out.println("Thank you for selecting Economy Class, your seat number is " +
            economyClassSeat[random.nextInt(9)] + ".");}



    }
}
