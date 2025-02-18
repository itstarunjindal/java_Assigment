import java.util.Scanner;

public class Mean_height_Of_players {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int sum = 0;
        for(int i=0;i<11;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        double mean_height = (double) sum/11;
        System.out.println("Mean height of layers is: "+mean_height);
    }
}
