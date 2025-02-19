import java.util.Scanner;

public class Handshake_Display {
    public static void main(String[] args) {
        System.out.println("Enter number of people: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = Handshake_Method.handshake(n);
        System.out.println("Maximum number of handshake possible: " + count);
    }
    
}
