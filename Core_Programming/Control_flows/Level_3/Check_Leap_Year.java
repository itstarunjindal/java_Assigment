import java.util.Scanner;

public class Check_Leap_Year {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year to check: ");
        int year = sc.nextInt();
        if(year<1582){
            System.out.println("Enter year greater than 1582 according to Gregorian Calendar");
        
        }
        else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a Leap Year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}