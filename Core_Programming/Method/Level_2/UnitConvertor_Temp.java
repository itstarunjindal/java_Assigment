public class UnitConvertor_Temp {

    private static final double fahrenheitToCelsius = 5.0 / 9;
    private static final double celsiusToFahrenheit = 9.0 / 5;
    private static final double poundsToKilograms = 0.453592;
    private static final double kilogramsToPounds = 2.20462;
    private static final double gallonsToLiters = 3.78541;
    private static final double litersToGallons = 0.264172;

    
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * fahrenheitToCelsius;
    }

    
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * celsiusToFahrenheit) + 32;
    }

    
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * poundsToKilograms;
    }

    
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * kilogramsToPounds;
    }

    
    public static double convertGallonsToLiters(double gallons) {
        return gallons * gallonsToLiters;
    }

    
    public static double convertLitersToGallons(double liters) {
        return liters * litersToGallons;
    }

    
    public static void main(String[] args) {
        System.out.println("10 Fahrenheit to Celsius: " + convertFahrenheitToCelsius(10));
        System.out.println("10 Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(10));
        System.out.println("10 pounds to kilograms: " + convertPoundsToKilograms(10));
        System.out.println("10 kilograms to pounds: " + convertKilogramsToPounds(10));
        System.out.println("10 gallons to liters: " + convertGallonsToLiters(10));
        System.out.println("10 liters to gallons: " + convertLitersToGallons(10));
    }
    
}
