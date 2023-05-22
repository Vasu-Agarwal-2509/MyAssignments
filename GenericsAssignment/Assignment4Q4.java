package GenericsAssignment;

public class Assignment4Q4 {
    public static void main(String[] args) {
        Pair pairObj = new Pair();
        pairObj.setKey("1");
        pairObj.setValue("Hello");

        Pair pairObj2 = new Pair();
        pairObj2.setKey("Today is");
        pairObj2.setValue(String.valueOf(new java.util.Date()));

        System.out.println(pairObj2.getValue());
    }
}
