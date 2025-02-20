public class UnitConvertor_yardToFeet {

    private static final double yardToFeet = 3;
    private static final double feetToYards = 0.333333;
    private static final double metersToInches = 39.3701;
    private static final double inchesToMeters = 0.0254;
    private static final double inchesToCentimeters = 2.54;

    
    public static double convertYardsToFeet(double yards) {
        return yards * yardToFeet;
    }

    
    public static double convertFeetToYards(double feet) {
        return feet * feetToYards;
    }

    
    public static double convertMetersToInches(double meters) {
        return meters * metersToInches;
    }

    
    public static double convertInchesToMeters(double inches) {
        return inches * inchesToMeters;
    }

    
    public static double convertInchesToCentimeters(double inches) {
        return inches * inchesToCentimeters;
    }

    
    public static void main(String[] args) {
        System.out.println("10 yards to feet: " + convertYardsToFeet(10));
        System.out.println("10 feet to yards: " + convertFeetToYards(10));
        System.out.println("10 meters to inches: " + convertMetersToInches(10));
        System.out.println("10 inches to meters: " + convertInchesToMeters(10));
        System.out.println("10 inches to centimeters: " + convertInchesToCentimeters(10));
    }
    
}
