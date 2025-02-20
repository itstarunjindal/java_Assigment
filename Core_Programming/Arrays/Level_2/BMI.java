import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of persons: ");
        int n = sc.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmiValues = new double[n];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height in meters: ");
            heights[i] = sc.nextDouble();
            System.out.print("Enter weight in kg: ");
            weights[i] = sc.nextDouble();

            bmiValues[i] = weights[i] / (heights[i] * heights[i]);


            if (bmiValues[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] >= 18.5 && bmiValues[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmiValues[i] >= 25 && bmiValues[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }

            System.out.println("BMI: " + bmiValues[i]);
            System.out.println("Weight status: " + weightStatus[i]);
            
        }

        



    }
    
}
