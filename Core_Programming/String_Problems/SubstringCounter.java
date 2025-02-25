import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        
        System.out.print("Enter the substring to count: ");
        String subString = scanner.nextLine();
        
        int count = countSubstringOccurrences(mainString, subString);
        
        System.out.println("The substring appears " + count + " times in the main string.");
        
        scanner.close();
    }
    
    public static int countSubstringOccurrences(String mainString, String subString) {
        int count = 0;
        int index = 0;
        
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }
        return count;
    }
}
