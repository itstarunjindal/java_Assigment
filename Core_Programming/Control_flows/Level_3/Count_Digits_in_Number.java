import java.util.Scanner;

public class Count_Digits_in_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to count: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Number of digits in " + n + " is " + count);
    }
    
}
