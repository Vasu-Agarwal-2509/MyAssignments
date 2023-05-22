package StreamsAssignment;

import java.util.Comparator;

public class SortByCalories implements Comparator<Fruit> {
    public int compare(Fruit f1, Fruit f2){
        if(f1.getCalories() < f2.getCalories())
            return 1;
        else if(f1.getCalories() > f2.getCalories())
            return -1;
        else
            return 0;
    }
}
