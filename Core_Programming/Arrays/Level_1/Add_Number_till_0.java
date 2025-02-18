import java.util.Scanner;

public class Add_Number_till_0 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter numbers: ");
        while(i<10){
            double x = sc.nextInt();
            if(x<=0) break;
            arr[i] = x;
            i++;
        }
        double sum = 0.0;
        for(int j=0;j<10;j++){
            if(arr[j]==0) break;
            sum+=arr[j];
        }
        System.out.println("Your sum result: "+sum);
    }
    
}
