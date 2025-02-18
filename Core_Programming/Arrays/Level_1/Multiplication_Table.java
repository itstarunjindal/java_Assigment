import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        System.out.println("Enter for multiplication: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[11];
        System.out.println("Result:");
        for(int i=1;i<=10;i++){
            arr[i] = i*n;
            System.out.println(n +"*"+ i +"="+ arr[i]);
        }
    }
}
