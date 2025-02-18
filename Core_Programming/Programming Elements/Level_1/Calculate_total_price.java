import java.util.Scanner;

public class Calculate_total_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int price = sc.nextInt();
        int total_price = quantity * price;
        System.out.println("Total price of items: "+ total_price+"if quantity is: "+ quantity+"and price is: "+ price);
    }
    
}
