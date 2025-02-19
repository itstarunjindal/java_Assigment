import java.util.Scanner;


public class Check_SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        String month = sc.next();
        System.out.println("Enter date: ");
        int date = sc.nextInt();
        checkSpring(month, date);
    }
    private static void checkSpring(String month, int date) {
        enumMonthClass enumMonthClass = enumMonthClass.valueOf(month);
        if(month.contains(enumMonthClass.toString()) || month.contains(enumMonthClass.toString()) || month.contains(enumMonthClass.June.toString())) {
            
        }
    
}
