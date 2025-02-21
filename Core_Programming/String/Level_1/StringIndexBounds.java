import java.util.Scanner;

public class StringIndexBounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = sc.nextInt();
        System.out.println(findIndex(s, i));
    }

    private static int findIndex(String s, int i){
        try{
            return s.charAt(i);
        }catch(StringIndexOutOfBoundsException e){
            return -1;
        }
    }
    
}
