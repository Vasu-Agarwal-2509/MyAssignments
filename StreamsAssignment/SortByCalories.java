package StreamsAssignment;

import java.util.Comparator;

public class SortByCalories implements Comparator<Fruit> {
    public int compare(Fruit f1, Fruit f2){
        if(f1.calories < f2.calories)
            return 1;
        else if(f1.calories > f2.calories)
            return -1;
        else
            return 0;
    }
}
