public class Frequency_of_number {

    public void printFrequency(String s) {
        int[] arr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - '0']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(i + " : " + arr[i]);
            }
        }
    }
}


