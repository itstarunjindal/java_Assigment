import java.util.Scanner;

public class Print_even_odd {

    public static void main(String[] args) {
        System.out.println("Enter number to itreate: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            if(i%2==0){
                System.out.println(i+" is even");
            }
            else{
                System.out.println(i+" is odd");
            }
        }
    }
}