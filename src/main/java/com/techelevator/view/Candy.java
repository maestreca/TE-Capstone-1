package com.techelevator.view;

public class Candy extends VendingItem {

    public Candy(String name, double price, String slotID) {
        super(name, price, slotID);
    }

    @Override
    public String vendingMessage() {

        return "Munch Munch, Mmm Mmm Good!";
    }







}
