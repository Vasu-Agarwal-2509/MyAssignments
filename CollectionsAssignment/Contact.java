package CollectionsAssignment;

enum gender{
    MALE, FEMALE;
}
public class Contact{
    long phoneNumber;
    String name;
    String email;
    Enum gender;
    public Contact(long phoneNumber, String name, String email, Enum gender){
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getContactDetails(Contact contact){
        return contact.phoneNumber + " " + contact.name + " " + contact.email + " " + contact.gender;
    }
}
