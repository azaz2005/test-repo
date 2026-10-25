

public class BankAccount {

    private double balance = 1000.0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(-500);
        account.withdraw(-200);

        System.out.println("Balance: " + account.getBalance());
    }
}
