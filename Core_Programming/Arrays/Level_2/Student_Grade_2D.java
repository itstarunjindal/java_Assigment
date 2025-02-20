import java.util.Scanner;

public class Student_Grade_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();


        double[][] studentData = new double[n][4];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print("Enter marks for " + subject + " (out of 100): ");
                    studentData[i][j] = sc.nextDouble();
                    if (studentData[i][j] < 0 || studentData[i][j] > 100) {
                        System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                    }
                } while (studentData[i][j] < 0 || studentData[i][j] > 100);
            }
            
            // Calculating percentage
            studentData[i][3] = (studentData[i][0] + studentData[i][1] + studentData[i][2]) / 3.0;
            
            // Assigning grade based on percentage
            if (studentData[i][3] >= 90) {
                grades[i] = "A";
            } else if (studentData[i][3] >= 80) {
                grades[i] = "B";
            } else if (studentData[i][3] >= 70) {
                grades[i] = "C";
            } else if (studentData[i][3] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        for(int i=0;i<n;i++){
            System.out.println("Student Info for:"+ (i+1));

            System.out.println("Physics: "+ studentData[i][0]);
            System.out.println("Chemistry: "+ studentData[i][0]);
            System.out.println("Maths: "+ studentData[i][2]);
            System.out.println("Percentage: "+ studentData[i][3]);

            System.out.println("Grade: "+ grades[i]);
        }
    }
}
