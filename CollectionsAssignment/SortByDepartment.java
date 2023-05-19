package CollectionsAssignment;

import java.util.Comparator;

public class SortByDepartment implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        return e1.department.compareTo(e2.department);
    }
}
