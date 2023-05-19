package StreamsAssignment;

import java.util.Comparator;

public class SortByValue implements Comparator<Transaction> {
    public int compare(Transaction t1, Transaction t2){
        if(t1.getValue() > t2.getValue())
            return 1;
        else if(t1.getValue() < t2.getValue())
            return -1;
        else
            return 0;
    }
}
