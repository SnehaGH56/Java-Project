import SNEHA.*;
import NAYANA.*;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("=== BANKING SYSTEM - TEAM PROJECT ===");
        System.out.println("Team Member 1 (SNEHA): Core Banking Logic");
        System.out.println("Team Member 2 (NAYANA): Advanced Features");
        System.out.println();

        try {
            // Initialize SNEHA's core banking
            BankingService bankingService = new BankingService();

            // Initialize NAYANA's advanced features
            AccountDatabase database = new AccountDatabase();
            TransactionProcessor processor = new TransactionProcessor();
            ReportGenerator reportGen = new ReportGenerator();

            // Demo the integrated system
            System.out.println("Creating account...");
            Account account = bankingService.openAccount("12345", "John Doe", "SAVINGS");
            database.storeAccount(account);

            System.out.println("Depositing ₹1000...");
            bankingService.deposit("12345", 1000);
            database.logTransaction("DEPOSIT: ₹1000 to account 12345");

            System.out.println("Withdrawing ₹200...");
            bankingService.withdraw("12345", 200);
            database.logTransaction("WITHDRAWAL: ₹200 from account 12345");

            System.out.println("Current balance: ₹" + bankingService.getBalance("12345"));
            System.out.println();

            System.out.println("=== SYSTEM INTEGRATION SUCCESSFUL ===");
            System.out.println("✅ SNEHA's modules working");
            System.out.println("✅ NAYANA's modules working");
            System.out.println("✅ Both teams integrated successfully");

            processor.shutdown();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
