import java.util.Scanner;

public class Factorial_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int factorial = 1;
        int i = 1;
        while(n>=1){
            factorial = factorial * i;
            i--;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
    }
    
}
