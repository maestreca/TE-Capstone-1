package com.techelevator;

import com.techelevator.view.VendingItem;

import java.util.HashMap;
import java.util.Map;

public class Gum extends VendingItem {

    public Gum(String name, double price, String slotID) {
        super(name, price, slotID);
    }

    @Override
    public String vendingMessage() {

        return "Chew Chew, Pop!";
    }

}
//How do we connect this map to CLI class?
//How do we connect 'name' 'price' & 'slotID'??
//Do we need these variables since we already have the map?
//Why do need to make the separate items in the maps instead of adding the
//maps to the super class (VendingItem?