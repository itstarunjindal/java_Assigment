public class UnitConvertor_distance {
    private static final double KmToMiles = 0.621371;
    private static final double MilesToKm = 1.60934;
    private static final double MetersToFeet = 3.28084;
    private static final double FeetToMeters = 0.3048;

    public static double convertKmToMiles(double km) {
        return km * KmToMiles;
    }

    public static double convertMilesToKm(double miles) {
        return miles * MilesToKm;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * MetersToFeet;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * FeetToMeters;
    }

    public static void main(String[] args) {
        System.out.println("10 km to miles: "+ convertFeetToMeters(10));
    }
}
