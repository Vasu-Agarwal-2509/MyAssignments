package StringAssignments;

public class Assignment6Q3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("StringBuilder");
        stringBuilder.append(" is a peer class of String");
        stringBuilder.append(" that provides much of");
        stringBuilder.append(" the functionality of strings");

        StringBuilder stringBuilder1 = new StringBuilder("It is used to  at the specified index position");
        stringBuilder1.insert(14, "insert text");
        System.out.println(stringBuilder1);

        StringBuilder stringBuilder2 = new StringBuilder("This method returns the reversed object on which it was called");
        stringBuilder2.reverse();
        System.out.println(stringBuilder2);
    }
}
