import java.util.Scanner;

public class Compare_2_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean compare = compare(s1, s2);
        boolean equal = s1.equals(s2);
        System.out.print("Result after charAt() method: ");
        System.out.println(compare);
        System.out.print("Result after equals() method: ");
        System.out.println(equal);   
    }
    public static boolean compare(String s1, String s2) {
        if(s1.length() == s2.length()) {
            for(int i=0; i<s1.length(); i++) {
                if(s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}