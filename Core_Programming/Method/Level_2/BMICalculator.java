import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][3];
        String[] bmiStatus = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
            
            personData[i][2] = calculateBMI(personData[i][0], personData[i][1]);
            bmiStatus[i] = determineBMIStatus(personData[i][2]);
        }

        System.out.println("\nHeight (cm) | Weight (kg) | BMI | Status");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f cm   | %.2f kg   | %.2f | %s%n", 
                personData[i][1], personData[i][0], personData[i][2], bmiStatus[i]);
        }
        
        
    }
}
