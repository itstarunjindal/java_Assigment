package Core_Programming.Level_1;

import java.util.Scanner;

public class Check_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n>0) {
            System.out.println(n + " is a positive number.");
        } else if(n<0) {
            System.out.println(n + " is a negative number.");
        } else {
            System.out.println(n + " is a zero.");
        }
    }
    
}
