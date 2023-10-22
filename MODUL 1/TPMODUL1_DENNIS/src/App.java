import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void AddAcc(Account account) {
        accounts.add(account);
    }

    public void RemAcc(String accountN) {
        accounts.removeIf(account -> account.getaccountN().equals(accountN));
    }

    public Account GetAcc(String accountN) {
        for (Account account : accounts) {
            if (account.getaccountN().equals(accountN)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }
}

class Account {
    private String name;
    private String accountN;
    private double balance;

    public Account(String accountN, String name, double balance) {
        this.name = name;
        this.accountN = accountN;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. Current balance is " + this.balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0) {
            if(amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Withdrawal successful. Current balance is " + this.balance);
            } else {
                System.out.println("Insufficient balance. Please enter a smaller amount.");
            }
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    public String getName() {
        return name;
    }

    public String getaccountN() {
        return accountN;
    }

    public double getBalance() {
        return balance;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        String option;

        bank.AddAcc(new Account("1", "Dennis Muladi", 1900000));
        bank.AddAcc(new Account("2", "Dennis The Menace", 2000000));
        bank.AddAcc(new Account("3", "Dennis The Lord", 6900000));

        System.out.println("Select 1/2/3/4/5/6/0: ");
        System.out.println("1. Add Account");
        System.out.println("2. Remove Account");
        System.out.println("3. Display Account");
        System.out.println("4. Display all Account");
        System.out.println("5. Deposit into Account");
        System.out.println("6. Withdraw from Account");
        System.out.println("0. EXIT");
        
        do {
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Enter Account Number: ");
                    String accountN = scanner.nextLine();
                    System.out.println("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();
                    bank.AddAcc(new Account(accountN, name, balance));
                    break;
                case "2":
                    System.out.println("Enter Account Number to Remove: ");
                    accountN = scanner.nextLine();
                    bank.RemAcc(accountN);
                    break;
                case "3":
                    System.out.println("Enter Account Number to Get: ");
                    accountN = scanner.nextLine();
                    Account account = bank.GetAcc(accountN);
                    if (account != null) {
                        System.out.println("Account Number: " + account.getaccountN());
                        System.out.println("Name: " + account.getName());
                        System.out.println("Balance: " + account.getBalance());
                    } else {
                        System.out.println("Account not found");
                    }
                    break;
                case "4":
                    List<Account> allAccounts = bank.getAllAccounts();
                    for (Account acc : allAccounts) {
                        System.out.println("Account Number: " + acc.getaccountN());
                        System.out.println("Name: " + acc.getName());
                        System.out.println("Balance: " + acc.getBalance());
                    }
                    break;
                case "5":
                    System.out.println("Enter Account Number: ");
                    accountN = scanner.nextLine();
                    System.out.println("Enter Deposit Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    account = bank.GetAcc(accountN);
                    if (account != null) {
                        account.deposit(amount);
                    } else {
                        System.out.println("Account not found");
                    }
                    break;
                case "6":
                    System.out.println("Enter Account Number: ");
                    accountN = scanner.nextLine();
                    System.out.println("Enter Withdraw Amount: ");
                    amount = scanner.nextDouble();
                    scanner.nextLine();
                    account = bank.GetAcc(accountN);
                    if (account != null) {
                        account.withdraw(amount);
                    } else {
                        System.out.println("Account not found");
                    }
                    break;
                case "0":
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        } while (!option.equals("0"));
        scanner.close();
    }
}