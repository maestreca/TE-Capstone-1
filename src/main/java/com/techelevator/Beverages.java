package com.techelevator;

import com.techelevator.view.VendingItem;

import java.util.HashMap;
import java.util.Map;

public class Beverages extends VendingItem {

    public Beverages(String name, double price, String slotID) {
        super(name, price, slotID);
    }

    public static void main(String[] args) {

        Map<String , Double> beverage = new HashMap<String, Double>();
        beverage.put("C1", 1.25);
        beverage.put("C2", 1.50);
        beverage.put("C3", 1.50);
        beverage.put("C4", 1.50);

    }



}
//How do we connect this map to CLI class?
//How do we connect 'name' 'price' & 'slotID'??
//Do we need these variables since we already have the map?
//Why do need to make the separate items in the maps instead of adding the
//maps to the super class (VendingItem?
