package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Inventory {

    public static void main(String[] args) throws FileNotFoundException {
        //Create file object
        File inputFile = new File("vendingmachine.csv");
        Scanner sc = new Scanner(inputFile);

        //Read file with a while loop

        System.out.println("Please choose an option >>>");

        while (sc.hasNextLine()) {
            String inLine = sc.nextLine();

            String[] itemArray = inLine.split("\\|");

            double price = Double.parseDouble(itemArray[2]);

            System.out.printf("%-4s %-20s %10.2f \n", itemArray[0], itemArray[1], price);
        }

    }

}
