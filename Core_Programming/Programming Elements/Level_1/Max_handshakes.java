import java.util.Scanner;

public class Max_handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = (n*(n-1))/2;
        System.out.println("Maximum number of possible "+ max);
    }
    
}
