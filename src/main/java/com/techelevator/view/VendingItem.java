package com.techelevator.view;

public abstract class VendingItem {

    private String slotLocation;
    private String name;
    private double price;
    private String itemType;
    private int inventoryAvailable; //5 at the beginning.

    private String vendingMessage;

    public VendingItem(String name, double price, String slotID) {
    }

    public VendingItem() {

    }

    public VendingItem(String name, double price, String slotID, String vendingMessage) {
    }


    //Hasn't created constructors yet. Is using the setters to set the values

    //Set and get information:

    public void setSlotLocation(String slotLocation) {
        this.slotLocation = slotLocation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setInventoryAvailable(int inventoryAvailable) {
        this.inventoryAvailable = inventoryAvailable;
    }

    public String getSlotLocation() {
        return slotLocation;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getItemType() {
        return itemType;
    }

    public int getInventoryAvailable() {
        return inventoryAvailable;
    }

    public String getVendingMessage() {
        return vendingMessage;
    }

    public void setVendingMessage(String vendingMessage) {
        this.vendingMessage = vendingMessage;
    }



    //Methods:

    public abstract String vendingMessage();


}




















//    private String name;
//    private double price;
//    private String slotID;
//    private double slotLimit;
//
//    //Constructors
//    public VendingItem(String name, double price, String slotID) {
//        this.name = name;
//        this.price = price;
//        this.slotID = slotID;
//    }
//
//    //G&S
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public String getSlotID() {
//        return slotID;
//    }
//
//    public void setSlotID(String slotID) {
//        this.slotID = slotID;
//    }
//
//    //Methods
//
//    //If Statement for SOLD OUT
//    public double slotLimit(){
//        if (slotLimit < 0 ){
//            System.out.println("SOLD OUT");
//        }
//        if (slotLimit > 0 && slotLimit<=5){
//            System.out.println("Is In Stock");
//        } return slotLimit;
//    }
//
//
//}
