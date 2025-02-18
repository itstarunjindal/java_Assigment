import java.util.Scanner;

public class Rocket_launch_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for countdown: ");
        int n = sc.nextInt();
        System.out.println("Countdown started: ");
        for(int i=n; i>0; i--) {
            System.out.println(i);
        }
        System.out.println("Countdown finished.");
    }
    
}
