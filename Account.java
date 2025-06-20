
package atmsimu;

import java.util.*;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<String> transactions;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactions = new ArrayList<>();
        addTransaction("Account opened with $" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void addTransaction(String txn) {
        transactions.add(txn);
        if (transactions.size() > 5) {
            transactions.remove(0);
        }
    }

    public List<String> getMiniStatement() {
        return new ArrayList<>(transactions);
    }
}
