public class Profit_Loss {
    public static void main(String[] args) {
        int cost_price = 129;
        int selling_price = 191;
        int profit = selling_price - cost_price;
        double profit_percentage = (profit * 100) / cost_price;
        System.out.println("Profit: " + profit + "\nProfit Percentage: " + profit_percentage);
    }
}
