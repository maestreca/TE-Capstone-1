package com.techelevator;

import com.techelevator.view.VendingItem;

import java.util.HashMap;
import java.util.Map;

public class Gum extends VendingItem {
    @Override
    public void vendingMessage() {
        System.out.println("Chew Chew, Pop!");

    }
    //****CI: I added the override

//    public Gum(String name, double price, String slotID) {
//        super(name, price, slotID);
//    }
//
//    public static void main(String[] args) {
//
//        Map<String , Double> gum = new HashMap<String, Double>();
//        gum.put("D1", 0.85);
//        gum.put("D2", 0.95);
//        gum.put("D3", 0.75);
//        gum.put("D4", 0.75);
//
//
//    }
}
//How do we connect this map to CLI class?
//How do we connect 'name' 'price' & 'slotID'??
//Do we need these variables since we already have the map?
//Why do need to make the separate items in the maps instead of adding the
//maps to the super class (VendingItem?