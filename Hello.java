class BankAccount {

    private String name;
    private double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    double getBalance() {
        return balance;
    }

    void displayInfo() {
        System.out.println("Account name: " + name);
        System.out.println("Current balance: " + balance);
        System.out.println();
    }
}

public class Hello {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("John", 10000);

        account1.displayInfo();

        account1.deposit(500);
        account1.withdraw(150);

        System.out.println("Balance now: " + account1.getBalance());
    }
}