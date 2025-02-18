import java.util.Scanner;

public class Largest_2_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int firstMax = arr[0];
        int secondMax = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>secondMax){
                if(arr[i]>firstMax){
                    secondMax = firstMax;
                    firstMax = arr[i];
                }
                else{
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("First max: "+ firstMax);
        System.out.println("Second max: "+ secondMax);
    }
    
}
