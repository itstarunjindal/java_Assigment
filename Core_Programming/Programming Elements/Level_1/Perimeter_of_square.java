import java.util.Scanner;

public class Perimeter_of_square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int perimeter = 4 * side;
        System.out.println("Length of side: "+ side+ "and perimeter of square is: "+ perimeter);
    }
}