package com.techelevator;

import com.techelevator.view.VendingItem;

import java.util.HashMap;
import java.util.Map;

public class Chips extends VendingItem {
    @Override
    public void vendingMessage() {
        System.out.println( "Crunch Crunch, It's Yummy!");

    }
    //****CI: I added the override


//    public Chips(String name, double price, String slotID) {
//        super(name, price, slotID);
//    }
//
//
//    public static void main(String[] args) {
//
//
//        Map<String , Double> chips = new HashMap<String, Double>();
//        chips.put("A1", 3.05);
//        chips.put("A2", 1.45);
//        chips.put("A3", 2.75);
//        chips.put("A4", 3.65);
//
//    }


}
//How do we connect this map to CLI class?
//How do we connect 'name' 'price' & 'slotID'??
//Do we need these variables since we already have the map?
//Why do need to make the separate items in the maps instead of adding the
//maps to the super class (VendingItem?