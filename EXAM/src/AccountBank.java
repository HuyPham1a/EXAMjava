import java.util.Scanner;

public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private Double balance;

    public AccountBank() {
        this.accountNumber = "000000000";
        this.accountHolderName = "No Name";
        this.balance = 0.0;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = Double.valueOf(balance);
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Phương thức rút tiền
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }
}    