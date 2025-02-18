import java.util.Scanner;

public class Check_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not a Prime Number.");
        }
    }
}
