import java.util.Scanner;

public class Student_Valid_Age {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]<0) System.out.print("Invalid Age");
            else if(arr[i]<=18){
                System.out.println("Student with age" +arr[i]+"can vote.");
            }
            else{
                System.out.println("Student with age" +arr[i]+ "can't vote");
            }
        }
    }
}