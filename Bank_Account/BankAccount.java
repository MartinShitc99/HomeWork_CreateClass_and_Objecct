package Bank_Account;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String someOwner, int someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }

    void deposit(int amount) {
        this.balance = (int) (this.balance + amount);
    }
    void withdraw(int amount) {
        this.balance = (int) (this.balance - amount);
    }

//    Геттеры
String getOwner() {
    return this.owner;
}
    int getBalance() {
        return this.balance;
    }

    //    Сеттеры
    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    void printBalance() {
        System.out.println("Пользователь: " + this.owner + " Баланс пользователя: " + this.balance);
    }

}
