import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature:  ");
        double temp = sc.nextDouble();
        System.out.println("Enter wind speed: ");
        double windSpeed = sc.nextDouble();
        WindChillCalculator wcc = new WindChillCalculator();
        double windChill = wcc.calculateWindChill( temp, windSpeed); 
        System.out.println(windChill);
    }
    
    public double calculateWindChill(double temp, double windSpeed){
        double windChill = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * windSpeed;
        return windChill;
    }
}
