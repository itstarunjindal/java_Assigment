import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String longestWord = findLongestWord(sentence);
        
        System.out.println("Longest word in the sentence: " + longestWord);
        
        scanner.close();
    }
    
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
