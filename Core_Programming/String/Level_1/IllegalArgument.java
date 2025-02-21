import java.util.Scanner;

public class IllegalArgument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = sc.nextInt();
        getSubString(s, i);
    }

    private static void getSubString(String s, int i) {
        try {
            System.out.println(s.substring(i));
        } catch (IllegalArgumentException e) {
            System.out.println("Index out of bounds");
        } catch(RuntimeException e){
            System.out.println("Caught RuntimeException: "+ e.getMessage());
        }
    }
    
}
