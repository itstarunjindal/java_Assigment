import java.util.Scanner;

public class Print_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter body weight in kg: ");
        int weight = sc.nextInt();
        System.out.println("Enter body height in cm: ");
        double height = (double)sc.nextInt()/100;
        double BMI = weight / (height * height);
        if(BMI < 18.5){
            System.out.println("Underweight");
        }
        else if(BMI < 25){
            System.out.println("Normal");
        }
        else if(BMI < 40){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
    
}
