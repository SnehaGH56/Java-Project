package SNEHA;

public class BankingService {
    private AccountManager accountManager;
    private TransactionManager transactionManager;
    
    public BankingService() {
        this.accountManager = new AccountManager();
        this.transactionManager = new TransactionManager();
    }
    
    public Account openAccount(String accountNumber, String name, String type) {
        return accountManager.createAccount(accountNumber, name, type);
    }
    
    public void deposit(String accountNumber, double amount) throws InvalidTransactionException {
        Account account = accountManager.getAccount(accountNumber);
        if (account == null) throw new InvalidTransactionException("Account not found");
        transactionManager.processDeposit(account, amount);
    }
    
    public void withdraw(String accountNumber, double amount) throws InsufficientFundsException, InvalidTransactionException {
        Account account = accountManager.getAccount(accountNumber);
        if (account == null) throw new InvalidTransactionException("Account not found");
        transactionManager.processWithdrawal(account, amount);
    }
    
    public double getBalance(String accountNumber) {
        Account account = accountManager.getAccount(accountNumber);
        return account != null ? account.getBalance() : 0.0;
    }
}
