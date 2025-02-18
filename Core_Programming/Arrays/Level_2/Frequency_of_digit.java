import java.util.Scanner;

public class Frequency_of_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int[] arr = new int[10];
        while (n > 0) {
            int x = n % 10;
            arr[x]++;
            n = n / 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " occurs " + arr[i] + " times");
        }
    }
}