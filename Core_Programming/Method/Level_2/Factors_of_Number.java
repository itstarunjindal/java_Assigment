import java.util.Scanner;

public class Factors_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] factor = printFactors(n);

        int sum = findSum(factor);
        int product = findProduct(factor);
        int sumOfSquare = findSumOfSquare(factor);
    }
    public static int[] printFactors(int n) {
        int[] factor = new int[n];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        return factor;
    }

    public static int findSum(int[] factor) {
        int sum = 0;
        for (int i = 0; i < factor.length; i++) {
            sum += factor[i];
        }
        return sum;
    }

    public static int findProduct(int[] factor) {
        int product = 1;
        for (int i = 0; i < factor.length; i++) {
            product *= factor[i];
        }
        return product;
    }

    public static int findSumOfSquare(int[] factor) {
        int sumOfSquare = 0;
        for (int i = 0; i < factor.length; i++) {
            sumOfSquare += factor[i] * factor[i];
        }
        return sumOfSquare;
    }
}
