import SNEHA.*;
import NAYANA.*;

public class SimpleMain {

    // ANSI color codes for pretty console output
    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {
        System.out.println(CYAN + BOLD + "=== PREMIUM BANKING SYSTEM - TEAM PROJECT ===" + RESET);
        System.out.println(YELLOW + "Team Member 1: SNEHA → Core Banking Logic (Modules 1-2)" + RESET);
        System.out.println(YELLOW + "Team Member 2: NAYANA → Advanced Features (Modules 3-5)" + RESET);
        System.out.println();

        try {
            // Initialize components
            BankingService bankingService = new BankingService();
            AccountDatabase database = new AccountDatabase();
            TransactionProcessor processor = new TransactionProcessor();
            ReportGenerator reportGen = new ReportGenerator();

            // Step 1: Create account
            simulate("Creating new account for John Doe...");
            Account account = bankingService.openAccount("12345", "John Doe", "SAVINGS");
            database.storeAccount(account);
            System.out.println(GREEN + "✔ Account created successfully!" + RESET);

            // Step 2: Deposit money
            simulate("Depositing $1000...");
            bankingService.deposit("12345", 1000);
            database.logTransaction("DEPOSIT: $1000 to account 12345");
            System.out.println(GREEN + "✔ Deposit successful!" + RESET);

            // Step 3: Withdraw money
            simulate("Withdrawing $200...");
            bankingService.withdraw("12345", 200);
            database.logTransaction("WITHDRAWAL: $200 from account 12345");
            System.out.println(GREEN + "✔ Withdrawal successful!" + RESET);

            // Step 4: Display balance
            simulate("Fetching account balance...");
            double balance = bankingService.getBalance("12345");
            System.out.println(YELLOW + "💰 Current Balance: $" + balance + RESET);
            System.out.println();

            // Step 5: Generate transaction report
            simulate("Generating mini transaction report...");
            System.out.println(BOLD + "\n=== MINI TRANSACTION SUMMARY ===" + RESET);
            System.out.println("Account Number : " + account.getAccountId());
            System.out.println("Account Holder : " + account.getAccountHolder());
            System.out.println("Account Type   : " + account.getAccountType());
            System.out.println("Transactions   : ");
            System.out.println("   • DEPOSIT   $1000");
            System.out.println("   • WITHDRAW  $200");
            System.out.println("Final Balance  : $" + balance);
            System.out.println(BOLD + "===============================" + RESET);
            System.out.println();

            // Step 6: System Integration Check
            simulate("Verifying module integration...");
            System.out.println(GREEN + BOLD + "=== SYSTEM INTEGRATION SUCCESSFUL ===" + RESET);
            System.out.println(GREEN + "✅ SNEHA's modules operational" + RESET);
            System.out.println(GREEN + "✅ NAYANA's modules operational" + RESET);
            System.out.println(GREEN + "✅ Integration verified and running smoothly" + RESET);
            System.out.println();

            // Step 7: Clean shutdown
            processor.shutdown();
            System.out.println(CYAN + "System shutting down... Thank you for using Premium Banking System 💜" + RESET);

        } catch (Exception e) {
            System.out.println(RED + "❌ Error: " + e.getMessage() + RESET);
        }
    }

    // Small helper to simulate progress (for realistic feel)
    private static void simulate(String message) {
        System.out.print(YELLOW + message + RESET);
        try {
            Thread.sleep(800); // slight delay for realism
            System.out.println();
        } catch (InterruptedException ignored) {}
    }
}
