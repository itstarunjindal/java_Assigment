import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        
        int vowels = countVowels(input);
        int consonants = countConsonants(input);
        
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        
        scanner.close();
    }
    
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiou";
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
    
    public static int countConsonants(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch) && "aeiou".indexOf(ch) == -1) {
                count++;
            }
        }
        return count;
    }
}
