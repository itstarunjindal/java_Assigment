import java.util.Scanner;

public class Distance_in_yard_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double Feet = sc.nextDouble();
        
        double Yards = Feet / 3;
        double Miles = Yards / 1760;
        
        System.out.println("Distance in yards: " + Yards);
        System.out.println("Distance in miles: " + Miles);
    }
}
