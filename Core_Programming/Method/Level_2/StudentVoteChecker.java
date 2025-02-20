import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            int age = scanner.nextInt();
            studentAges[i] = age;

            if (canStudentVote(age)) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
            }
        }
        
    }
}
