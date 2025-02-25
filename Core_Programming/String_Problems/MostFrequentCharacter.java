import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char mostFrequent = findMostFrequentCharacter(input);
        
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
        
        scanner.close();
    }
    
    public static char findMostFrequentCharacter(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        
        char mostFrequent = str.charAt(0);
        int maxCount = 0;
        
        for (char ch : charCount.keySet()) {
            if (charCount.get(ch) > maxCount) {
                maxCount = charCount.get(ch);
                mostFrequent = ch;
            }
        }
        
        return mostFrequent;
    }
}
