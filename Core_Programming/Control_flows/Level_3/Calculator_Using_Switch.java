import java.util.Scanner;

public class Calculator_Using_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double first = sc.nextDouble();
        System.out.println("Enter second number: ");
        double second = sc.nextDouble();
        System.out.println("Enter operator: ");
        String operator = sc.next();
        switch (operator) {
            case "+":
            System.out.println(first + second);
            break;

            case "-":
            System.out.println(first - second);
            break;

            case "*":
            System.out.println(first * second);
            break;

            case "/":
            System.out.println(first / second);
            break;

            default:
                System.out.println("Invalid operator");
                break;
        }
    }
    
}
