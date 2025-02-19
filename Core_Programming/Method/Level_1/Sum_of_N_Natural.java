import java.util.Scanner;

public class Sum_of_N_Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = getSum(n);
        System.out.println(sum);
    }
    public static int getSum(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }
}
