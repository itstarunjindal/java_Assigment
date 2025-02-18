import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int x = temp % 10;
            sum = sum + x * x * x;
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong Number.");
        } else {
            System.out.println(n + " is not an Armstrong Number.");
        }
    }
}
