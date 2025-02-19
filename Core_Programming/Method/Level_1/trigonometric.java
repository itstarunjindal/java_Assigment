import java.util.Scanner;

public class trigonometric {
    public static double[] calculateTrigonometricFunctions(double angle){
        double rad = Math.toRadians(angle);
        return new double[]{Math.sin(rad), Math.cos(rad), Math.tan(rad)};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle: ");
        double angle = sc.nextDouble();
    
        System.out.println(calculateTrigonometricFunctions(angle));
    }
}
