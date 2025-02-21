import java.util.Scanner;

public class String_toCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        char[] charArrayMethod = charArrayMethod(s);
        
        System.out.println(charArray);
        System.out.println(charArrayMethod);
    }

    private static char[] charArrayMethod(String s) {
        char[] ch = new char[s.length()];
        for(int i=0; i<s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        return ch;
    }
}
