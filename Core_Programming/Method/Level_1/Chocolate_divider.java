import java.util.Scanner;

public class Chocolate_divider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int n = sc.nextInt();
        System.out.print("Enter number of students: ");
        int m = sc.nextInt();
        int[] ans = QuotientRemainder.findRemainderAndQuotient(n, m);
        System.out.println("Chocolate per student: " + ans[0]);
        System.out.println("Remaining chocolate: " + ans[1]);
    }
}
