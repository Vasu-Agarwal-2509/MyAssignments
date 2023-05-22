package CollectionsAssignment;
import java.util.*;

public class Assignment8Q1 {
    public static void main(String[] args) {
        Contact contactObj1 = new Contact(908443953, "Vasu", "vasu@gmail.com", gender.MALE);
        Contact contactObj2 = new Contact(353762584, "Rahul", "rahul@gmail.com", gender.MALE);
        Contact contactObj3 = new Contact(678323222, "Shaurya", "shaurya@gmail.com", gender.MALE);

        Map<Long, Contact> treeMap = new TreeMap<Long, Contact>(Collections.reverseOrder()); //new SortByPhoneNumber()
        treeMap.put(contactObj1.phoneNumber, contactObj1);
        treeMap.put(contactObj2.phoneNumber, contactObj2);
        treeMap.put(contactObj3.phoneNumber, contactObj3);


        for(long phoneNum : treeMap.keySet())
            System.out.println("Keys: " + phoneNum);
        System.out.println();
        for (long phoneNum : treeMap.keySet()) {
            Contact contactObj = treeMap.get(phoneNum);
            System.out.println("Values: " + contactObj);
        }
        System.out.println();
        for (long phoneNum : treeMap.keySet()) {
            Contact contactObj = treeMap.get(phoneNum);
            System.out.println("Keys: " + phoneNum + " Values: " + contactObj);
        }
    }
}