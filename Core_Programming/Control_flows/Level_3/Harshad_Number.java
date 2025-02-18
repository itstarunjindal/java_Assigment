import java.util.Scanner;

public class Harshad_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while(temp>0){
            int x = temp%10;
            count++;
            temp = temp/10;
        }
        if(n%count==0){
            System.out.println(n+" is a Harshad Number.");
        }
        else{
            System.out.println(n+" is not a Harshad Number.");
        }
    }
    
}
