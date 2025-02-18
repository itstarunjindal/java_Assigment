import java.util.Scanner;

public class Area_of_Traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        double inches = area * 0.155;

        System.out.println("Your height in cm is "+ area+ "and area in feet is"+ inches);

    }
    
}
