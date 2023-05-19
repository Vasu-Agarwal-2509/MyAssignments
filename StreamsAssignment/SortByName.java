package StreamsAssignment;

import java.util.Comparator;

public class SortByName implements Comparator<Trader> {
    public int compare(Trader t1, Trader t2){
        return t1.name.compareTo(t2.name);
    }

}
