package GenericsAssignment;

import java.util.HashSet;

class Employee{
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public void displayDetails(){
        System.out.println(id + " " + name + " " + salary + " " + department);
    }
}
public class Assignment4Q1 {
    public static void main(String[] args) {
        Employee empObj = new Employee(1, "Vasu", 550000, "Computer Science");
        Employee empObj2 = new Employee(2, "Rahul", 425000, "Computer Science");
        HashSet<Employee> hs = new HashSet<>();
        hs.add(empObj);
        hs.add(empObj2);
        for(Employee e : hs){
            e.displayDetails();
        }
    }
}
