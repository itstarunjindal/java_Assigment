public class NullPointer_Exception {
    public static void main(String[] args) {
        // generateException();
        handleException();
    }
    
    public static void generateException() {
        String s = null;
        s.length();
    }

    public static void handleException() {
        String s = null;
        try {
            s.length();
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
    }
}
