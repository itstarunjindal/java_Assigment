class BankAccount {
    // Static variable shared across all accounts
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;
    
    // Final variable for account number
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        totalAccounts++; // Increment total accounts on creation
    }

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    
    // Method to display account details using instanceof
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        } else {
            System.out.println("Invalid account instance.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Mohit", 1001, 5000.0);
        BankAccount acc2 = new BankAccount("Komal", 1002, 3000.0);
        
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
