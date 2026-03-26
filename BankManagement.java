public class BankManagement {
 
    static double balance = 0;

    static void deposit(double amount)
    {
        balance = balance + amount;
    }

    static void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance = balance - amount;

        }
        else
        {
            System.out.println("Insufficient Balance: ");
        }
    }
    static void showbalance()
    {
        System.out.println(balance);
    }

    public static void main(String args[])
    {
        deposit(2000.5);
        showbalance();

        withdraw(3000);
        showbalance();

        withdraw(200);
        showbalance();
    }
}

