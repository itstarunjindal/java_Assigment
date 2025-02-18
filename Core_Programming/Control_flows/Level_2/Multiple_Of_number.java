import java.util.Scanner;

public class Multiple_Of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 100; i++) {
            if(i%n==0){
                System.out.println(i);
            }
        }
    }
    
}
