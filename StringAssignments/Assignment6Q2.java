package StringAssignments;

public class Assignment6Q2 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("StringBuffer");
        stringBuffer.append(" is a peer class of String");
        stringBuffer.append(" that provides much of");
        stringBuffer.append(" the functionality of strings");

        StringBuffer stringBuffer1 = new StringBuffer("It is used to  at the specified index position");
        stringBuffer1.insert(14, "insert text");
        System.out.println(stringBuffer1);

        StringBuffer stringBuffer2 = new StringBuffer("This method returns the reversed object on which it was called");
        stringBuffer2.reverse();
        System.out.println(stringBuffer2);
    }
}
