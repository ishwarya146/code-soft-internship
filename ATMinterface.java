
import java.util.Scanner;

// make two class one is bank account and second is ATM interfcae

class Bankaccount {

    private double balance; // made it private so that it acnnot be accessed directly outside the class

    public Bankaccount(double balance) {
        this.balance = balance; // constructor to assign the initial balance to the account
    }

    public void deposit(double amount) { // deposit method
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully");

        } else {
            System.out.println("Invalid amount");
        }

    }

    public void withdraw(double amount) { // withdraw method
        if (amount > balance) {
            System.out.println("Insufficient Balance! Withdrawal failed");

        } else if (amount > 0) {
            balance -= amount;
            System.out.println("$ " + amount + " withdrawn successfully");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public double checKBalance() { // balane check
        return balance;

    }
}

class ATM { // ATM class

    
    private Bankaccount userAccount; //userAccount: A reference to a Bankaccount object, which will store the user's bank details (balance, deposit, withdrawal). its called loose coupling too.
    private Scanner sc; // A Scanner object, which will be used to take user input.

    public ATM(Bankaccount account) { // using constructor, assigning value to these variables. The constructor takes a Bankaccount object as a parameter (account).
        this.userAccount = account;// Assigns the passed Bankaccount object to the userAccount variable.
        this.sc = new Scanner(System.in);
    }

    public void interfaceStart() { // main starting of ATM interface
        while (true) {
            System.out.println("ATM MENU");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Choose an option from above: ");

            int choice = sc.nextInt();


            switch (choice) { // using switch statement to define the choices
                case 1:
                    System.out.println("Your current balance is $ " + userAccount.checKBalance());
                    break;
                case 2:
                    System.out.println("Enter deposit amount: $");
                    double depositAmt = sc.nextDouble();
                    userAccount.deposit(depositAmt);
                    break;
                case 3:
                    System.out.println("Enter your withdrawal amount: $");
                    double withdrawalAmt = sc.nextDouble();
                    userAccount.withdraw(withdrawalAmt);
                    break;
                case 4:
                    System.out.println("Thank you for using User ATM!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid!! Please try again");
            }

        }
    }

}

public class ATMinterface {

    public static void main(String[] args) {
        Bankaccount bnc = new Bankaccount(1000); //Create a bank account with initial balance
        ATM useratm = new ATM(bnc); //Passed it to account ATM

        useratm.interfaceStart(); //start the ATM interface

    }
}