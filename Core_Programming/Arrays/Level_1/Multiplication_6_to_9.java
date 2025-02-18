import java.util.Scanner;

public class Multiplication_6_to_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mul = new int[10];
        int n = sc.nextInt();
        for(int i=6;i<=9;i++){
            mul[i] = i*n;
        }
        for(int i=6;i<=9;i++){
            System.out.println(n+ "*" +i+ "=" +mul[i]);
        }
    }
}
