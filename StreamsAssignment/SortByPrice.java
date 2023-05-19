package StreamsAssignment;

import java.util.Comparator;

public class SortByPrice implements Comparator<Fruit> {
    public int compare(Fruit f1, Fruit f2){
        if(f1.getPrice() > f2.getPrice())
            return 1;
        else if(f1.getPrice() < f2.getPrice())
            return -1;
        else
            return 0;
    }
}
