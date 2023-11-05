package com.techelevator;

import com.techelevator.view.VendingItem;

import java.util.HashMap;
import java.util.Map;

public class Chips extends VendingItem {

    public Chips(String name, double price, String slotID) {
        super(name, price, slotID);
    }

    @Override
    public String vendingMessage() {

        return "Crunch Crunch, It's Yummy!";

    }

//    @Override
//    public String dispense() {
//        return "Crunch Crunch, It's Yummy!";
//    }




}

//How do we connect this map to CLI class?
//How do we connect 'name' 'price' & 'slotID'??
//Do we need these variables since we already have the map?
//Why do need to make the separate items in the maps instead of adding the
//maps to the super class (VendingItem?