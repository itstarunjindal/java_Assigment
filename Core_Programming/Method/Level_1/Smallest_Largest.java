import java.util.Scanner;

public class Smallest_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        int[] result = findSmallestAndLargest(a, b, c);
    }

    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int[] result = new int[2];
        if (a < b && a < c) {
            result[0] = a;
        } else if (b < a && b < c) {
            result[0] = b;
        } else {
            result[0] = c;
        }

        if (a > b && a > c) {
            result[1] = a;
        } else if (b > a && b > c) {
            result[1] = b;
        } else {
            result[1] = c;
        }

        return result;
    }
    
}
