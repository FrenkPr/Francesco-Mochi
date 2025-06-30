import java.util.ArrayList;

class BankAccount
{
    //instance variables declaration
    private String accountHolderName;
    private double balance;

    //constructor method
    public BankAccount(String accountHolderName, double balance)
    {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    //deposit method
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Just deposited " + amount + "$ on your balance");
    }

    //withdraw method
    public void withdraw(double amount)
    {
        if(balance - amount < 0.0)
        {
            System.out.println("Withdraw amount asked: " + amount + "\nCurrent balance: " + balance + "$");
            System.out.println(accountHolderName + ", you're too poor to withdraw this amount. Operation aborted");

            return;
        }

        balance -= amount;
        System.out.println("Just withdrew " + amount + "$ from your balance");
    }

    //print data method
    public void displayBalance()
    {
        System.out.println(accountHolderName + ", here is your current balance: " + balance + "$");
    }
}

public class EsercizioBankAccounts
{
    public static void main(String[] args)
    {
        //variables declaration & init
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        int bankAccountRandIndex = 0;
        int withdrawAmountRandQuantity = (int)(Math.random() * 1000000) + 1;

        //adding bank accounts
        bankAccounts.add(new BankAccount("Francesco Mochi", 2000));
        bankAccounts.add(new BankAccount("Ubba", 5000));
        bankAccounts.add(new BankAccount("Omab", 7000));
        bankAccounts.add(new BankAccount("Osak", 10000));

        //gets a random bank account between 0 and the current bankAccounts size
        bankAccountRandIndex = (int)(Math.random() * bankAccounts.size());

        //prints start bank accounts data
        for (BankAccount bankAccount : bankAccounts)
        {
            bankAccount.displayBalance();
        }

        //deposits a random amount on a random bank account
        bankAccounts.get(bankAccountRandIndex).deposit(withdrawAmountRandQuantity);

        //prints bank accounts updated data
        for (BankAccount bankAccount : bankAccounts)
        {
            bankAccount.displayBalance();
        }

        //withdraws a random amount on a random bank account
        withdrawAmountRandQuantity = (int)(Math.random() * 1000000) + 1;
        bankAccounts.get(bankAccountRandIndex).withdraw(withdrawAmountRandQuantity);

        //prints bank accounts updated data
        for (BankAccount bankAccount : bankAccounts)
        {
            bankAccount.displayBalance();
        }
    }
}
