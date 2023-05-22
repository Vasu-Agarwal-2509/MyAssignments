package LambdaExpressionsAssignment;

import java.util.ArrayList;

public class Assignment5Q2 {
    private int totalPrice;
    private String status;

    public static ArrayList<Assignment5Q2> listOfOrders(ArrayList<Assignment5Q2> orders) {
        ArrayList<Assignment5Q2> ansList = new ArrayList<>();
        orders.forEach(assignmentObj -> {
            if((assignmentObj.totalPrice > 10000) && (assignmentObj.status.equals("ACCEPTED")) || (assignmentObj.status.equals("COMPLETED"))){
                ansList.add(assignmentObj);
            }
        });
        return ansList;
    }
    public static void main(String[] args) {
        Assignment5Q2 obj1 = new Assignment5Q2();
        obj1.totalPrice = 20000;
        obj1.status = "ACCEPTED";

        Assignment5Q2 obj2 = new Assignment5Q2();
        obj2.totalPrice = 30000;
        obj2.status = "COMPLETED";

        Assignment5Q2 obj3 = new Assignment5Q2();
        obj3.totalPrice = 10000;
        obj3.status = "ACCEPTED";

        Assignment5Q2 obj4 = new Assignment5Q2();
        obj4.totalPrice = 2000;
        obj4.status = "NOT COMPLETED";

        Assignment5Q2 obj5 = new Assignment5Q2();
        obj5.totalPrice = 50000;
        obj5.status = "COMPLETED";

        ArrayList<Assignment5Q2> orders = new ArrayList<>();
        orders.add(obj1);
        orders.add(obj2);
        orders.add(obj3);
        orders.add(obj4);
        orders.add(obj5);

        ArrayList<Assignment5Q2> listObtained = listOfOrders(orders);
        listObtained.forEach(mainObj -> System.out.println("Total Price: " + mainObj.totalPrice + " Status: " + mainObj.status));
    }
}
