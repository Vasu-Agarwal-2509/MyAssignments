package IntermediateOOPSAssignment;

class SingletonInheritanceCheck{
    public static SingletonInheritanceCheck singletonVariable = null;
    public int val;
    private SingletonInheritanceCheck(){
        val = 1;
    }
    static SingletonInheritanceCheck singletonMethod(){
        if(singletonVariable == null)
            singletonVariable = new SingletonInheritanceCheck();
        return singletonVariable;
    }
}
public class Assignment2Q1{
    public static void main(String[] args) {
        SingletonInheritanceCheck obj1 = SingletonInheritanceCheck.singletonMethod();
        SingletonInheritanceCheck obj2 = SingletonInheritanceCheck.singletonMethod();

        obj1.val = 2;
        System.out.println(obj1.val);
        System.out.println(obj2.val);
    }
}
