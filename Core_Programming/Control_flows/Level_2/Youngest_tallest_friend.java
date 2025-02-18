import java.util.Scanner;

public class Youngest_tallest_friend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amar's age: ");
        int Amar_age = sc.nextInt();
        System.out.println("Enter Amar's height: ");
        int Amar_height = sc.nextInt();
        System.out.println("Enter Akbar's age: ");
        int Akbar_age = sc.nextInt();
        System.out.println("Enter Akbar's height: ");
        int Akbar_height = sc.nextInt();
        System.out.println("Enter Anthony's age: ");
        int Anthony_age = sc.nextInt();
        System.out.println("Enter Anthony's height: ");
        int Anthony_height = sc.nextInt();
        

        if(Amar_age < Akbar_age && Amar_age < Anthony_age){
            System.out.println("Amar is the youngest.");
        }
        else if(Akbar_age < Amar_age && Akbar_age < Anthony_age){
            System.out.println("Akbar is the youngest.");
        }
        else{
            System.out.println("Anthony is the youngest.");
        }

        
        if(Amar_height > Akbar_height && Amar_height > Anthony_height){
            System.out.println("Amar is the tallest.");
        }
        else if(Akbar_height > Amar_height && Akbar_height > Anthony_height){
            System.out.println("Akbar is the tallest.");
        }
        else{
            System.out.println("Anthony is the tallest.");
        }
    }
    
}
