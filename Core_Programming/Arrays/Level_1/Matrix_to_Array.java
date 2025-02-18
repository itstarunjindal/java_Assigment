import java.util.Scanner;

public class Matrix_to_Array {
    public static void main(String[] args) {
        System.out.println("Enter size of row:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Enter size of column: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int[] arr = new int[row*col];

        System.out.println("Enter elements of matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int index = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[index++] = matrix[row][col];
            }
        }
        System.out.println("Elements of array are: ");
        for(int i=0;i<index;i++){
            System.out.println(arr[i]+ " ");
        }
    }
    
}
