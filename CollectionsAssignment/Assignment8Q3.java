package CollectionsAssignment;

import java.util.*;

public class Assignment8Q3 {
    public static void main(String[] args) {
        Employee employeeObj1 = new Employee(2, "Emily Johnson", "Marketing", 60000);
        Employee employeeObj2 = new Employee(5, "Michael Davis", "IT", 65000);
        Employee employeeObj3 = new Employee(3, "David Wilson", "Human Resources", 70000);
        Employee employeeObj4 = new Employee(1, "John Smith", "Sales", 50000);
        Employee employeeObj5 = new Employee(4, "Jessica Lee", "Finance", 70000);
        Employee employeeObj6 = new Employee(8, "Laura Martinez", "Customer Service", 40000);
        Employee employeeObj7 = new Employee(7, "Daniel Rodriguez", "Research and Development", 75000);
        Employee employeeObj8 = new Employee(9, "Christopher Brown", "Engineering", 80000);
        Employee employeeObj9 = new Employee(6, "Sarah Thompson", "Operations", 45000);
        Employee employeeObj10 = new Employee(10, "Olivia Harris", "Administration", 50000);


        System.out.println("a) ID");
        System.out.println("b) Name");
        System.out.println("c) Department");
        System.out.println("d) Salary");
        System.out.println("Enter your choice:");

        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        if(choice.equals("a")){
            TreeSet<Employee> setA = new TreeSet<>(new SortById());
            setA.add(employeeObj1);
            setA.add(employeeObj2);
            setA.add(employeeObj3);
            setA.add(employeeObj4);
            setA.add(employeeObj5);
            setA.add(employeeObj6);
            setA.add(employeeObj7);
            setA.add(employeeObj8);
            setA.add(employeeObj9);
            setA.add(employeeObj10);
            for(Employee employeeObj : setA)
                System.out.println(employeeObj);
        }
        else if(choice.equals("b")){
            TreeSet<Employee> setB = new TreeSet<>(new SortByName());
            setB.add(employeeObj1);
            setB.add(employeeObj2);
            setB.add(employeeObj3);
            setB.add(employeeObj4);
            setB.add(employeeObj5);
            setB.add(employeeObj6);
            setB.add(employeeObj7);
            setB.add(employeeObj8);
            setB.add(employeeObj9);
            setB.add(employeeObj10);
            for(Employee employeeObj : setB)
                System.out.println(employeeObj);
        }
        else if(choice.equals("c")){
            TreeSet<Employee> setC = new TreeSet<>(new SortByDepartment());
            setC.add(employeeObj1);
            setC.add(employeeObj2);
            setC.add(employeeObj3);
            setC.add(employeeObj4);
            setC.add(employeeObj5);
            setC.add(employeeObj6);
            setC.add(employeeObj7);
            setC.add(employeeObj8);
            setC.add(employeeObj9);
            setC.add(employeeObj10);
            for(Employee employeeObj : setC)
                System.out.println(employeeObj);
        }
        else if(choice.equals("d")){
            TreeSet<Employee> setD = new TreeSet<>(new SortBySalary());
            setD.add(employeeObj1);
            setD.add(employeeObj2);
            setD.add(employeeObj3);
            setD.add(employeeObj4);
            setD.add(employeeObj5);
            setD.add(employeeObj6);
            setD.add(employeeObj7);
            setD.add(employeeObj8);
            setD.add(employeeObj9);
            setD.add(employeeObj10);
            for(Employee employeeObj : setD)
                System.out.println(employeeObj);
        }
    }
}
