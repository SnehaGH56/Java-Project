package SNEHA;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions;
    
    public TransactionManager() {
        this.transactions = new ArrayList<>();
    }
    
    public void processDeposit(Account account, double amount) throws InvalidTransactionException {
        account.deposit(amount);
        transactions.add(new Transaction(account.getAccountNumber(), "DEPOSIT", amount));
    }
    
    public void processWithdrawal(Account account, double amount) throws InsufficientFundsException {
        account.withdraw(amount);
        transactions.add(new Transaction(account.getAccountNumber(), "WITHDRAWAL", amount));
    }
    
    public List<Transaction> getTransactionHistory(String accountNumber) {
        List<Transaction> accountTransactions = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getAccountNumber().equals(accountNumber)) {
                accountTransactions.add(t);
            }
        }
        return accountTransactions;
    }
}
