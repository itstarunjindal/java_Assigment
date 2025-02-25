package oop;

public class MobilePhone {
    String brand;
    String model;
    int price;
    
    MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
    }
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone("Apple", "iPhone",40000);
        mp.displayDetails();
    }
    
}
