import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number is"+ check(n));
    }
    private static String check(int n) {
        if(n==0){
            return "Zero";
        }
        else if(n>0){
            return "Positive";
        }
        else{
            return "Negative";
        }
    }
}
