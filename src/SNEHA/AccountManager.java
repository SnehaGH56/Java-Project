package SNEHA;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {
    private Map<String, Account> accounts;
    
    public AccountManager() {
        this.accounts = new HashMap<>();
    }
    
    public Account createAccount(String accountNumber, String name, String type) {
        Account account = new Account(accountNumber, name, type);
        accounts.put(accountNumber, account);
        return account;
    }
    
    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
    
    public boolean accountExists(String accountNumber) {
        return accounts.containsKey(accountNumber);
    }
}
