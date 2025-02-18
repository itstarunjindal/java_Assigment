package Core_Programming.Level_1;

import java.util.Scanner;

public class Check_Divisible_By_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check divisible by 5: ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5");
        } else {
            System.out.println(n + " is not divisible by 5");
        }
    }
}