package ExceptionHandlingAssignment;

import java.util.Scanner;

class SavingAccount{
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
class IllegalBankTransactionException extends Throwable{
    public IllegalBankTransactionException(){

    }
}
class InsufficientBalanceException extends Throwable{
    public InsufficientBalanceException(){

    }
}
public class Assignment3Q3 {
    public static void main(String[] args) throws InsufficientBalanceException,IllegalBankTransactionException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id:");
        long id = sc.nextLong();
        System.out.println("Enter balance:");
        double balance = sc.nextDouble();
        SavingAccount savingAccountObj = new SavingAccount(id, balance);
        try{
            System.out.println("Enter amount for withdrawal");
            double amount = sc.nextDouble();
                if(savingAccountObj.withdraw(amount) < 0)
                    throw new InsufficientBalanceException();
                else
                    throw new IllegalBankTransactionException();
        }
        catch(InsufficientBalanceException e){
            System.out.println("Balance is insufficient");
        }
        catch(IllegalBankTransactionException e){
            System.out.println("Enter valid amount");
        }
    }
}
