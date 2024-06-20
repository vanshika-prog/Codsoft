import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initialBalance = 100000.0;
        BankAccount account = new BankAccount(initialBalance);

        while(true){
            System.out.println();
            System.out.println("Welcome to the ATM Machine");
            System.out.println("1) Check Balance");
            System.out.println("2) Deposit");
            System.out.println("3) Withdraw");
            System.out.println("4) Exit");
            System.out.println("Enter your choice: ");
        
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is : " + account.getBalance());
                    break;

                case 2:
                    System.out.println("Enter the deposit amount: $");    
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.println("Enter the withdrawal amount: $");
                    double withdrawalAmount = sc.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
     }
    
 }


class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit Successfully! New balance: $ " + balance);
        }else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal Sucessfully! New balance: $ " + balance);
        }else if(amount <= 0){
            System.out.println("Invalid withdrawal amount.");
        }else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
} 


    