import java.util.Arrays;
import java.util.Scanner;

public class FindFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for(int i=1;i<=number;i++){
            if(number%i==0){
                if(index == maxFactor){
                    maxFactor*=2;
                    factors = Arrays.copyOf(factors, maxFactor);
                }
                factors[index++] = i;
            }
        }

        System.out.println("Factors are: ");
        for(int i=0;i<index;i++){
            System.out.print(factors[i] + " ");
        }
    }
}
