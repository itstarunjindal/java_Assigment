import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String[] ans = new String[n+1];
        for(int i=1;i<=n;i++){
            if(i%(3*5)==0){
                ans[i] = "FizzBuzz";
            }
            else if(i%5==0){
                ans[i] = "Buzz";
            }
            else if(i%3==0){
                ans[i] = "Fizz";
            }
            else{
                ans[i] = String.valueOf(i);
            }
        }
        for(int i=1;i<=n;i++){
            System.out.println("Value at " +i+ " is "+ ans[i]);
        }
    }
    
}
