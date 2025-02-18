import java.util.Scanner;

public class Odd_Even_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int n = sc.nextInt();
        
        int[] odd = new int[n/2+1];
        int[] even = new int[n/2+1];
        int oddIndex = 0,evenIndex = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                odd[oddIndex++] = i;
            }
            else{
                even[evenIndex++] = i;
            }
        }
        System.out.println("Odd numbers are: ");
        for(int i=0;i<oddIndex;i++){
            System.out.print(odd[i] + " ");
        }
        for(int i=0;i<evenIndex;i++){
            System.out.println(even[i] + " ");
        }
    }
}
