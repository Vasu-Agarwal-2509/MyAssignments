package IntermediateOOPSAssignment;

import java.lang.reflect.Array;
import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3{
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash(){
        return totalDeposits + creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3{
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash(){
        return totalDeposits + fixedDepositAmount;
    }
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
        int totalCash = 0;
        for(int val : cash)
            totalCash += val;
        return totalCash;
    }
    public int getCash(){
        return 1;
    }
    public static void main(String[] args) {
        CurrentAccount currentAccountObj = new CurrentAccount();
        SavingsAccount savingsAccountObj = new SavingsAccount();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(currentAccountObj.getCash());
        list.add(savingsAccountObj.getCash());
        Assignment2Q3 obj = new Assignment2Q3();
        System.out.println(obj.totalCashInBank(list));
    }
}
