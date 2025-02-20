import java.util.Scanner;

public class Check_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if(year<1582){
            System.out.println("Enter valid year >=1582");
            return;
        }

        if(isLeapYear(year)){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
    }

    private static boolean isLeapYear(int year) {
        if(year%4==0 && year%100!=0 || year%400==0){
            return true;
        }
        return false;
    }
    
}
