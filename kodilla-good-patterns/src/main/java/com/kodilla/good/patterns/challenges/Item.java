package com.kodilla.good.patterns.challenges;

public class Item {
    private String itemName;
    private int itemPrice;
    private String itemDescription;

    public Item(String itemName, int itemPrice, String itemDescription) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }
}