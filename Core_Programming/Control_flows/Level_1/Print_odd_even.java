import java.util.Scanner;

public class Print_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            if(i%2==0) {
                System.out.println("Even number: " + i);
            } else {
                System.out.println("Odd number: " + i);
            }
        }
    }
    
}
