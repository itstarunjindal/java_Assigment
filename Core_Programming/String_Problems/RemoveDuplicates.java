import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = removeDuplicates(input);
        
        System.out.println("String after removing duplicates: " + result);
        
        scanner.close();
    }
    
    public static String removeDuplicates(String str) {
        StringBuilder uniqueChars = new StringBuilder();
        boolean[] seen = new boolean[256];
        
        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                uniqueChars.append(ch);
                seen[ch] = true;
            }
        }
        return uniqueChars.toString();
    }
}
