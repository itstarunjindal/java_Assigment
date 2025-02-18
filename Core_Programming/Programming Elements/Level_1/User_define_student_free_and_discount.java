import java.util.Scanner;

public class User_define_student_free_and_discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discount = sc.nextInt();
        int discount_fee = fee * discount / 100;
        int total_fee = fee - discount_fee;
        System.out.println("The total fee after discount is: " + total_fee+ "and discount is: " + discount_fee);
    }
    
}
