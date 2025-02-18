import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first val: ");
        double a = sc.nextInt();
        System.out.println("Enter second val: ");
        double b = sc.nextInt();
        System.out.println("Enter third value: ");
        double c = sc.nextInt();

        System.out.println("Answer for operation a+b*c"+ (a+b*c));

        System.out.println("Answer for operation: a*b+c "+ (a*b+c));

        System.out.println("Answer for operation: c+ a/b"+ (c+a/b));

        System.out.println("Answer for operation: a%b+c"+ (a%b+c));
    }
}
