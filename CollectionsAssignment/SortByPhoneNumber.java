package CollectionsAssignment;
import java.util.Comparator;

public class SortByPhoneNumber implements Comparator<Contact> {
    public int compare(Contact c1, Contact c2){
        if(c1.phoneNumber < c2.phoneNumber)
            return 1;
        else if(c1.phoneNumber > c2.phoneNumber)
            return -1;
        else
            return 0;
    }
}
