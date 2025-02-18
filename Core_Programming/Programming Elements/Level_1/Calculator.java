import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first val: ");
        int val1 = sc.nextInt();
        System.out.println("Enter second val: ");
        int val2 = sc.nextInt();
        int sum = val1 + val2;
        int sub = val1 - val2;
        int mul = val1 * val2;
        int div = val1 / val2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers"+ val1 +"and"+ val2 +"is: \n" + sum + "\n" + sub + "\n" + mul + "\n" + div);
    }
    
}
