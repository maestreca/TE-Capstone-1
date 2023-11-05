package com.techelevator;

import com.techelevator.view.VendingItem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

    //Add a list of vending items

    private List<VendingItem> vItems = new ArrayList<>();

    private double balance; //keep track of the money

    //Add getters & Setters:


    public void setvItems(List<VendingItem> vItems) {
        this.vItems = vItems;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<VendingItem> getvItems() {
        return vItems;
    }

    public double getBalance() {
        return balance;
    }

    //Methods - something meaningful
    //maybe method to get the inventory/ stock

    public void getInventory() {
        //use logic from yesterday to read from the input file and split it and read it

        File inputFile = new File("vendingmachine.csv"); //file object to point to the input file

        //add scanner
        try {
            Scanner sc = new Scanner(inputFile);

            while (sc.hasNext()) {
                String inLine = sc.nextLine(); //this calls the next line from the file array: A1 [0] |Potato Crisps [1] |3.05 [2] |Chip [3]
                String[] strArray = inLine.split("\\|"); //split into string array
                double price = Double.parseDouble(strArray[2]); //called the price

                //instantiate vending item

                VendingItem vItem = new VendingItem() {
                    @Override
                    public String vendingMessage() {

                        return null;
                    }

//                    @Override
//                    public String dispense() {
//                        return null;
//                    }


                };



                vItem.setSlotLocation(strArray[0]);//specify slot zero because zero is slot location
                vItem.setName(strArray[1]);
                vItem.setPrice(price); //you add a price here because you already converted it in the while loop
                vItem.setItemType(strArray[3]);
                vItem.setInventoryAvailable(5);//5 items max

                //because you have a list, you add vItems
                vItems.add(vItem);
            }


        } catch (FileNotFoundException e) {
            System.out.printf(e.getMessage());
        }


    }

    public boolean displayMenuItems() { //use this when trying to display the items in the main program constants

        for (VendingItem vT : vItems) { //the inventory list created earlier. vT = vending item

            System.out.printf("%-4s %-20s %-10.2f %d \n", vT.getSlotLocation(), vT.getName(), vT.getPrice(), vT.getInventoryAvailable()); //use getters here

        }
        return false;
    }





    public void purchase(String slotLocation) {
        for (VendingItem vItem : vItems) {

            if (vItem.getSlotLocation().equals(slotLocation)) {
                if (vItem.getSlotLocation().equals(slotLocation)) {
                    if (vItem.getInventoryAvailable()  <= 0) {

                        System.out.println("Sorry, " + vItem.getName() + " is sold out.");
                        return; // ####CI: Item is sold out, return without processing the purchase
                    }
                    System.out.println(vItem.getName() + " " + vItem.getSlotLocation() + " " + vItem.getPrice());

                    balance = balance - vItem.getPrice();

                    vItem.setInventoryAvailable(vItem.getInventoryAvailable() - 1);

                    System.out.println("Current Inventory: " + vItem.getInventoryAvailable());
                    System.out.println("Current Balance: " + balance);
                    System.out.println(vItem.getVendingMessage()); //###CI: Changed
                    System.out.println(); //****CI: I added this to add a space. The formatting is better in the console :)





                }
            }
        }
    }
}
