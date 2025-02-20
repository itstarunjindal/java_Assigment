import java.util.Scanner;

public class Height_Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[3];
        System.out.println("Enter Amar's height : ");
        height[0] = sc.nextDouble();
        System.out.println("The Akbar's height: ");
        height[1] = sc.nextDouble();
        System.out.println("Enter Anthony's height: ");
        height[2] = sc.nextDouble();
        
        int tallest = 0;
        int youngest = 0;

        for (int i = 0; i < height.length; i++) {
            if (height[i] > height[tallest]) {
                tallest = i;
            }
            if (height[i] < height[youngest]) {
                youngest = i;
            }
        }
        System.out.println("The tallest is: " + tallest);
        System.out.println("The youngest is: " + youngest);
    }
}
