import java.util.Scanner;

public class Bonus_toEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year of service: ");
        int n = sc.nextInt();
        if(n<5){
            System.out.println("Not eligible for bonus");
        }
        else{
            System.out.println("Enter salary: ");
            int salary = sc.nextInt();
            double bonus = 0.05*salary;
            System.out.println("Your bonus is: "+bonus);
        }
    }
    
}
