import java.util.Scanner;

public class Check_number_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println(arr[i]+ "is positive and is even");
                }
                else{
                    System.out.println(arr[i]+ "is positive and is odd");
                }
            }
            else if(arr[i]==0){
                System.out.println("Enter number is zero");
            }
            else{
                System.out.println(arr[i]+ "is negative");
            }
        }
    }
    
}
