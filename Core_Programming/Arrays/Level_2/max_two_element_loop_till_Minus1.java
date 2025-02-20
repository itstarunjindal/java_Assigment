import java.util.Scanner;

public class max_two_element_loop_till_Minus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLength = 2;
        int[] arr = new int[maxLength];

        int index = 0;

        while(true){
            int num = sc.nextInt();
            if(num == -1){
                break;
            }


            if(index==maxLength){
                maxLength+=10;
                int[] temp = new int[maxLength];
                System.arraycopy(arr, 0, temp, 0,  arr.length);
                arr = temp;
            }
            arr[index++] = num;
        }
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
        }
    }
}
