import java.util.Scanner;

public class Sum_n_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Enter valid natural number");
            return;
        }

        int sumRecursive = sumRecursive(n);
        int sumFormula = n*(n+1)/2;

        System.out.println("Sum using formula: "+sumFormula);
        System.out.println("Sum using recursion: "+sumRecursive);
    }

    private static int sumRecursive(int n) {
        if(n==1){
            return 1;
        }
        return n + sumRecursive(n-1);
    }
    
}
