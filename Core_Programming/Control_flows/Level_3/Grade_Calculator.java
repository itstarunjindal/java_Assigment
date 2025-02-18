import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter physics marks: ");
        int physics = sc.nextInt();
        System.out.println("Enter chemistry marks: ");
        int chemistry = sc.nextInt();
        System.out.println("Enter maths marks: ");
        int maths = sc.nextInt();
        int total = physics + chemistry + maths;
        int percentage = total / 3;
        if (percentage >= 80) {
            System.out.println("Grade A and Remarks: agency-normalized standards");
        } else if (percentage >= 70) {
            System.out.println("Grade B and Remarks: agency-normalized standards");
        } else if (percentage >= 60) {
            System.out.println("Grade C and Remarks: approaching agency-normalized standards");
        } else if (percentage >= 50) {
            System.out.println("Grade D and Remarks: below agency-normalized standards");
        } else if (percentage >= 40) {
            System.out.println("Grade: D and Remarks: too below agency-normalized standards");
        } else {
            System.out.println("Grade: F and Remarks: Remedial standards");
        }
    }
    
}
