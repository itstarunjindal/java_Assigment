import java.util.Scanner;

public class Spring_Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month: ");
        String month = sc.next();
        int day = sc.nextInt();

        if (month.equals("March") && day >= 20 || month.equals("June") && day <= 20) {
            System.out.println("Spring is here.");
        }
        else if(month.equals("April") || month.equals("May")) {
            System.out.println("Spring is here.");
        }
        else {
            System.out.println("Spring is not here.");
        }
    }
}
