import java.util.ArrayList;
import java.util.Scanner;

public class displayAccountInfo {
    ArrayList<AccountBank> accs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void createAccount() {
        System.out.println("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.println("Enter account name: ");
        String accountHolderName = sc.nextLine();
        System.out.println("Enter account balance: ");
        String accountBalance = sc.nextLine();
        AccountBank acc = new AccountBank();
        accs.add(acc);
        acc.setAccountNumber(accountNumber);
        acc.setAccountHolderName(accountHolderName);
        acc.setBalance(accountBalance);
        System.out.println("Saved successfully");
    }
    public void showAccount() {
        System.out.printf( "AccountNumber", "AccountHolderName", "Balance");
        for (int i = 0; i < accs.size(); i++) {
            AccountBank acc = accs.get(i);
            System.out.printf(acc.getAccountNumber(), acc.getAccountHolderName(), acc.getBalance());
        }
        System.out.println("Press Enter to continue.");
        sc.nextLine();
    }

}

