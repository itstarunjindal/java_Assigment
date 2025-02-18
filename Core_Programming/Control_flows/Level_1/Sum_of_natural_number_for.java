import java.util.Scanner;

public class Sum_of_natural_number_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        int byFormula = n*(n+1)/2;
        if(sum == byFormula) {
            System.out.println("Sum of natural number is equal to by formula." + sum);
        }
    }
    
}
