public class NumberChecker6 {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigitsArray(int n) {
        String numStr = String.valueOf(n);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2];
    }

    public static int sumOfFactors(int number) {
        int sum = 0;
        for (int factor : findFactors(number)) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int number) {
        int product = 1;
        for (int factor : findFactors(number)) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubesOfFactors(int number) {
        double product = 1;
        for (int factor : findFactors(number)) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        return sumOfFactors(number) - number == number;
    }

    public static boolean isAbundantNumber(int number) {
        return sumOfFactors(number) - number > number;
    }

    public static boolean isDeficientNumber(int number) {
        return sumOfFactors(number) - number < number;
    }

    public static int factorial(int number) {
        if (number == 0 || number == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        for (int digit : getDigitsArray(number)) {
            sum += factorial(digit);
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Greatest Factor: " + findGreatestFactor(number));
        System.out.println("Sum of Factors: " + sumOfFactors(number));
        System.out.println("Product of Factors: " + productOfFactors(number));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(number));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}
