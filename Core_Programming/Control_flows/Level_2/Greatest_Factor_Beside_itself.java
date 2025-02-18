import java.util.Scanner;

public class Greatest_Factor_Beside_itself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find feactor: ");
        int n = sc.nextInt();
        for(int i=n/2;i>=1;i--){
            if(n%i==0){
                System.out.println(i);
                break;
            }
        }
    }
    
}
