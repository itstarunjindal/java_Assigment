package Core_Programming.Level_1;

import java.util.Scanner;

public class Sum_Of_n_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n<0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            System.out.println((n)*(n+1)/2);
        }
    }
    
}
