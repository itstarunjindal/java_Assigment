import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();
        
        generateFibonacci(terms);
        
        scanner.close();
    }
    
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;
        System.out.println("Fibonacci Sequence:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
