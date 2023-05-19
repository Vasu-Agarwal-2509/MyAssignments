package CollectionsAssignment;

public class Employee {
    int id;
    String name;
    String department;
    long salary;
    public Employee(int id, String name, String department, long salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String toString(){
        return id + " " + name + " " + department + " " + salary;
    }
}
