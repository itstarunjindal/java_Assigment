import java.util.Scanner;

public class Calculate_Simple_Interst {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the interest rate: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time: ");
        double time = sc.nextDouble();

        double SI = Calculate_SI(principal, rate, time);
        System.out.println("The Simple Interest is: " + SI +"for principal"+ principal + "rate of interst"+ rate + "and time"+ time);
    }
    private static double Calculate_SI(double principal, double rate, double time) {
        double SI = (principal * rate * time) / 100;
        return SI;
    }
}