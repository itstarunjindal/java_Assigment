package oop;

public class ItemTracker {
    int itemCode;
    String itemName;
    int price;

    ItemTracker(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + this.itemCode);
        System.out.println("Item Name: " + this.itemName);
        System.out.println("Item Price: " + this.price);
    }

    public void getCost(int quantity) {
        int cost = this.price * quantity;
        System.out.println("Total cost: " + cost);
    }

    public static void main(String[] args) {
        ItemTracker item = new ItemTracker(1, "Laptop", 50000);
        item.displayDetails();
        int quantity = 5;
        item.getCost(quantity);
    }
}
