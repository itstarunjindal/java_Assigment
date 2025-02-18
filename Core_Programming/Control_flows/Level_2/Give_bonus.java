import java.util.Scanner;

public class Give_bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of year of service: ");   
        int n = sc.nextInt();
        System.out.println("Enter the salary: ");
        int s = sc.nextInt();
        if(n>5) {
            System.out.println("Your bonus is: "+(s*5/100));
        }
    }
}
