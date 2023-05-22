package LambdaExpressionsAssignment;

import java.util.ArrayList;

public class Assignment5Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        employeeList.removeIf(s -> s.length() % 2 != 0);
        return employeeList;
    }
    public static void main(String[] args) {
        Assignment5Q4 obj = new Assignment5Q4();
        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.add("hgfvbj");
        employeeList.add("uhbqs");
        employeeList.add("ihdaha");
        employeeList.add("dsyasnasn");
        employeeList.add("a");
        ArrayList<String> listObtained = obj.removeOddLength(employeeList);
        listObtained.forEach(s -> System.out.println(s));
    }
}
