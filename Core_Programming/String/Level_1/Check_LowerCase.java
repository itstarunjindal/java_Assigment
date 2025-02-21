import java.util.Scanner;

public class Check_LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        String inBuilt = s.toLowerCase();

        String custom = convertToLowerCase(s);

        System.out.println(inBuilt);
        System.out.println(custom);
    }

    private static String convertToLowerCase(String s){
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                ans.append((char) (c+32));
            }
            else ans.append(c);
        }
        return ans.toString();
    }
    
}
