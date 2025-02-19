import java.util.Scanner;

public class Number_of_round {
    public static void main(String[] args) {
        System.out.println("Enter length of first size of traingle: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter length of second size of traingle: ");
        int b = sc.nextInt();
        System.out.println("Enter length of third size of traingle: ");
        int c = sc.nextInt();
        int ans = roundNeed(a,b,c);
    }
    private static int roundNeed(int a, int b, int c) {
        int perimeter = a + b + c;
        return 5000/perimeter;
    }
}
