import java.util.Scanner;

public class sum_of_number_using_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        double sum = 0;
        while(true){
            int x = sc.nextInt();
            if(x!=0){
                sum+=x;
                System.out.print("Number added to sum add other value: ");
            }
            else break;
        }
        System.out.println("Sum of input numbers: "+sum);
    }
    
}
