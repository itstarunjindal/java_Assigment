import java.util.Scanner;

public class SubString_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String substring = s1.substring(2, 5);
        String substring2 = substringMethod(s1, 2, 5);
        System.out.println(substring);
        System.out.println(substring2);
    }
    public static String substringMethod(String s1, int start, int end) {
        String substring = "";
        for(int i=start; i<end; i++) {
            substring += s1.charAt(i);
        }
        return substring;
    }
}
