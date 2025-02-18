import java.util.Scanner;

public class Kilometer_to_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km * 1/1.6;
        System.out.println("Distance in miles: " + miles);
    }
    
}
