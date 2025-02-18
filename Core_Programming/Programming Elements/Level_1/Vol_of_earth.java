public class Vol_of_earth {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius = 6378;
        double volume = 4/3 * pi * radius * radius * radius;
        double cubic_miles = 0.23991*volume;

        System.out.println("Volume of the earth: " + volume+ "and cubic miles: " + cubic_miles);
    }
    
}
