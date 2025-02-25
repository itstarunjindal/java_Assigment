import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Convert to (C/F): ");
        char unit = scanner.next().charAt(0);
        
        if (unit == 'C' || unit == 'c') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is " + celsius + " Celsius.");
        } else if (unit == 'F' || unit == 'f') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is " + fahrenheit + " Fahrenheit.");
        } else {
            System.out.println("Invalid input. Please enter C or F.");
        }
        
        scanner.close();
    }
    
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
