package NAYANA;

import SNEHA.*;

public class BankingSystem {
    private BankingService bankingService;
    private TransactionProcessor processor;
    private AccountDatabase database;
    
    public BankingSystem() {
        this.bankingService = new BankingService();
        this.processor = new TransactionProcessor();
        this.database = new AccountDatabase();
    }
    
    public BankingService getBankingService() { return bankingService; }
    public TransactionProcessor getProcessor() { return processor; }
    public AccountDatabase getDatabase() { return database; }
}
