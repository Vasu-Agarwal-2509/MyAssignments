package CollectionsAssignment;
import java.util.*;

public class Assignment8Q1 {
    public static void main(String[] args) {
        Contact ct1 = new Contact(908443953, "Vasu", "vasu@gmail.com", gender.MALE);
        Contact ct2 = new Contact(353762584, "Rahul", "rahul@gmail.com", gender.MALE);
        Contact ct3 = new Contact(678323222, "Shaurya", "shaurya@gmail.com", gender.MALE);

        Map<Long, Contact> mp = new TreeMap<Long, Contact>(new SortByPhoneNumber());
        mp.put(ct1.phoneNumber, ct1);
        mp.put(ct2.phoneNumber, ct2);
        mp.put(ct3.phoneNumber, ct3);

        for(long phoneNum : mp.keySet())
            System.out.println("Keys: " + phoneNum);
        System.out.println();
        for (long phoneNum : mp.keySet()) {
            Contact contactObj = mp.get(phoneNum);
            System.out.println("Values: " + contactObj.getContactDetails(contactObj));
        }
        System.out.println();
        for (long phoneNum : mp.keySet()) {
            Contact contactObj = mp.get(phoneNum);
            System.out.println("Keys: " + phoneNum + " Values: " + contactObj.getContactDetails(contactObj));
        }
    }
}
