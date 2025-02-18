public class Quotient_reminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first val:");
        int val1 = sc.nextInt();
        System.out.println("Enter second val:");
        int val2 = sc.nextInt();
        
        int quotient = val1 / val2;
        int reminder = val1 % val2;
        System.out.println("Quotient: " + quotient);
        System.out.println("Reminder: " + reminder);
    
}
