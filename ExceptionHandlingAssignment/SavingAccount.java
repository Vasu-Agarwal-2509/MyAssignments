package ExceptionHandlingAssignment;

public class SavingAccount{
    long id;
    double balance;
    public SavingAccount(long id, double balance){
        this.id = id;
        this.balance = balance;
    }
    public double withdraw(double amount){
        balance -= amount;
        return balance - amount;
    }
    public double deposit(double amount){
        balance += amount;
        return balance;
    }
}
