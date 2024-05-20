import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        choice();
    }

    public static void choice() {
        Scanner sc = new Scanner(System.in);
        displayAccountInfo dpAcc = new displayAccountInfo();
        AccountBank Account = new AccountBank();
        dpAcc.createAccount();
        while (true) {
            System.out.println("Enter your selection");
            System.out.println("1. Create AccountBank");
            System.out.println("2. Show Accounts ");
            System.out.println("3. deposit");
            System.out.println("4. withdraw");
            System.out.println("5. ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    dpAcc.createAccount();
                    break;
                case 2:
                    dpAcc.showAccount();

                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    Account.deposit(depositAmount);
                    dpAcc.showAccount();
                    break;
                case 4:
                    System.out.print("Enter amount to deposit: ");
                    double withdrawAmount = sc.nextDouble();
                    Account.withdraw(withdrawAmount);
                    dpAcc.showAccount();
                    break;
                case 5:

                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}