package StreamsAssignment;

import java.util.Comparator;

public class SortByColor implements Comparator<Fruit> {
    public int compare(Fruit f1, Fruit f2){
        int val = f1.getColor().compareTo((f2.getColor()));
        if(val == 0){
            if(f1.getCalories() < f2.getCalories())
                return 1;
            else if(f1.getCalories() > f2.getCalories())
                return -1;
            else
                return 0;
        }
        return val;

    }
}
