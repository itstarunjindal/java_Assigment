import java.util.Scanner;

public class Rocket_Launch_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for countdown: ");
        int n = sc.nextInt();
        System.out.println("Countdown started: ");
        while(n>0) {
            System.out.println(n);
            n--;
        }
        System.out.println("Countdown finished.");
    }
}
