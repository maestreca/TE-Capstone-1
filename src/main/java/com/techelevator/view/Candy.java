package com.techelevator.view;

public class Candy extends VendingItem{
    public Candy(String slotLocation, String name, double price, String itemType, int inventoryAvailable) {
        super(slotLocation, name, price, itemType, inventoryAvailable);
    }

    @Override

    public void vendingMessage(){
        System.out.println("Munch Munch, Mmm Mmm Good!");
    }

    //****CI: I added the override


    //    public Candy(String name, double price, String slotID) {
//        super(name, price, slotID);
//    }
//
//    public static void main(String[] args) {
//
//
//        Map<String , Double> candy = new HashMap<String, Double>();
//        candy.put("B1", 1.80);
//        candy.put("B2", 1.50);
//        candy.put("B3", 1.50);
//        candy.put("B4", 1.75);

        //How do we connect this map to CLI class?
        //How do we connect 'name' 'price' & 'slotID'??
        //Do we need these variables since we already have the map?
        //Why do need to make the separate items in the maps instead of adding the
        //maps to the super class (VendingItem?


   // }




}
