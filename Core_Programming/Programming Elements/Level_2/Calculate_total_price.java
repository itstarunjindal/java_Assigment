import java.util.Scanner;

public class Calculate_total_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double quantity = sc.nextInt();
        double price = sc.nextInt();
        double total_price = quantity * price;
        System.out.println("Total price of items: "+ total_price+"if quantity is: "+ quantity+"and price is: "+ price);
    }
    
}
