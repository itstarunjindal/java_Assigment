import java.util.Scanner;

public class Height_cm_to_feet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm = sc.nextDouble();
        double feet = cm/2.54;
        int foot = (int) feet/12;
        
        feet%=12;
        
        System.out.println("Your height in cm is"+ cm+ "and height in feet is"+ foot+ "and inches is"+ feet);
    }
    
}
