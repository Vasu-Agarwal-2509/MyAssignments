package CollectionsAssignment;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        if(e1.id > e2.id)
            return 1;
        else if(e1.id < e2.id)
            return -1;
        return 0;
    }
}
