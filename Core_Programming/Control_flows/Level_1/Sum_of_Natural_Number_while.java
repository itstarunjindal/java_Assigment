import java.util.Scanner;

public class Sum_of_Natural_Number_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n<=0) System.out.println("Enter natural number");
        int sum = 0;
        int i = 1;
        while(i<n){
            sum += i;
            i++;
        }
        int byFormula = n*(n+1)/2;
        if(sum == byFormula) {
            System.out.println("Sum of natural number is equal to by formula." + sum);
        }
    }
    
}
