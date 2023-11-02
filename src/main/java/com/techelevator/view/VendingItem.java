package com.techelevator.view;

public class VendingItem {

    //Attributes
    private String name;
    private double price;
    private String slotID;
    private double slotLimit;

    //Constructors
    public VendingItem(String name, double price, String slotID) {
        this.name = name;
        this.price = price;
        this.slotID = slotID;
    }

    //G&S

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSlotID() {
        return slotID;
    }

    public void setSlotID(String slotID) {
        this.slotID = slotID;
    }

    //Methods

    //If Statement for SOLD OUT
    public double slotLimit(){
        if (slotLimit < 0 ){
            System.out.println("SOLD OUT");
        }
        if (slotLimit > 0 && slotLimit<=5){
            System.out.println("Is In Stock");
        } return slotLimit;
    }


}
