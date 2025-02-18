import java.util.Scanner;

public class sum_of_positive_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double sum = 0;
        while(true){
            double x = sc.nextDouble();
            if(x<=0){
                System.out.println("Sum of enter numbers: "+sum);
                break;
            }
            else{
                sum+=x;
                System.out.println("Number added to sum add other value: ");
            }
        }
    }
    
}
