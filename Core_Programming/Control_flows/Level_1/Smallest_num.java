package Core_Programming.Level_1;

import java.util.Scanner;

public class Smallest_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbers: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second numbers: ");
        int n2 = sc.nextInt();
        System.out.println("Enter third numbers: ");
        int n3 = sc.nextInt();
        if(n1 < n2 && n1 < n3) {
            System.out.println("Smallest number is " + n1);
        } else if (n2 < n3) {
            System.out.println("Smallest number is " + n2);
        } else {
            System.out.println("Smallest number is " + n3);
        }
    }
}
