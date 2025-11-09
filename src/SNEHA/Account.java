package SNEHA;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    
    public Account(String accountNumber, String accountHolderName, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = 0.0;
    }
    
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }
    public String getAccountType() { return accountType; }
    
    public void deposit(double amount) throws InvalidTransactionException {
        if (amount <= 0) throw new InvalidTransactionException("Invalid deposit amount");
        balance += amount;
    }
    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) throw new InsufficientFundsException("Insufficient funds");
        balance -= amount;
    }
}
