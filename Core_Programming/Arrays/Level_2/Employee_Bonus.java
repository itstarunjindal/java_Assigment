import java.util.Scanner;

public class Employee_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double[] salary = new double[n];
        double[] year = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            System.out.println("Enter the year of employee " + (i + 1) + ": ");
            year[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (year[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }
            newSalary[i] = salary[i] + bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }

        System.out.println(" Total old salary: " + totalOldSalary);

        System.out.println("Total new salary: " + totalNewSalary);

        System.out.println("Total bonus: " + totalBonus);
    }
    
}
