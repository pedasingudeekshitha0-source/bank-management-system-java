import java.util.Scanner;

class BankAccount {

    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        }
    }

    void displayAccount() {

        System.out.println("\n===== Account Details =====");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

public class BankManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Create Bank Account =====");

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount user = new BankAccount(accNo, name, balance);

        while (true) {

            System.out.println("\n===== Bank Management System =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Account");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();

                    user.deposit(depositAmount);
                    break;

                case 2:

                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = sc.nextDouble();

                    user.withdraw(withdrawAmount);
                    break;

                case 3:

                    user.displayAccount();
                    break;

                case 4:

                    System.out.println("Exiting Program...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
  }
## Sample Output

===== Create Bank Account =====

Enter Account Number: 101
Enter Account Holder Name: Deekshitha
Enter Initial Balance: 50000

===== Bank Management System =====

1. Deposit
2. Withdraw
3. View Account
4. Exit

Enter Your Choice: 1

Enter Deposit Amount: 121

Amount Deposited Successfully!

===== Bank Management System =====

1. Deposit
2. Withdraw
3. View Account
4. Exit

Enter Your Choice: 2

Enter Withdraw Amount: 1000

Withdrawal Successful!

===== Bank Management System =====

1. Deposit
2. Withdraw
3. View Account
4. Exit

Enter Your Choice: 3

===== Account Details =====

Account Number: 101
Account Holder: Deekshitha
Balance: ₹49121.0

===== Bank Management System =====

1. Deposit
2. Withdraw
3. View Account
4. Exit

Enter Your Choice: 4

Exiting Program...
