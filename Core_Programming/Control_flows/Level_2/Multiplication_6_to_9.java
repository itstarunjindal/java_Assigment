import java.util.Scanner;

public class Multiplication_6_to_9 {
    public static void main(String[] args) {
        System.out.println("Enter number to itreate: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=6;i<=9;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
    
}
