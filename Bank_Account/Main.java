package Bank_Account;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Andrew", 599);

        bankAccount.deposit(300);
        bankAccount.withdraw(100);

        bankAccount.printBalance();

    }
}
