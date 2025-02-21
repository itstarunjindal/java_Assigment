public class NumberChecker5 {

    public static int countDigits(int n){
        return String.valueOf(n).length();
    }
    

    public static int[] getDigitsArray(int n){
        String numStr = String.valueOf(n);
        int[] digits = new int[numStr.length()];

        for(int i=0;i<numStr.length();i++){
            digits[i] = numStr.charAt(i)-'0';
        }
        return digits;
    }

    public static boolean isPrime(int n){
        if(n<2) return false;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeonNumber(int n){
        int square = n*n;

        int sum = 0;
        while (square>0) {
            sum+=square%10;
            square/=10;
        }
        return sum==n;
    }

    public static boolean isSpyNumber(int n){
        int[] digits = getDigitsArray(n);
        int sum = 0, product = 1;

        for(int digit : digits){
            sum+=digit;
            product*=digit;
        }
        return sum==product;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    }

    public static boolean isBuzzNumber(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon Number: " + isNeonNumber(number));
        System.out.println("Is Spy Number: " + isSpyNumber(number));
        System.out.println("Is Automorphic: " + isAutomorphic(number));
        System.out.println("Is Buzz Number: " + isBuzzNumber(number));
    }
}
