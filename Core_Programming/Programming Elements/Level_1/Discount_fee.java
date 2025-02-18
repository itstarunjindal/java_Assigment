public class Discount_fee {
    public static void main(String[] args) {
        int fee = 125000;
        int discount = 10;
        int discount_fee = fee * discount / 100;
        int total_fee = fee - discount_fee;
        System.out.println("The total fee after discount is: " + total_fee+ "and discount is: " + discount_fee);
    }
}
