package IntermediateOOPSAssignment;

abstract class Persistence{
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist(){
        return "Data is saved in file";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist(){
        return "Data is saved in database";
    }
}
public class Assignment2Q6 {
    public static void main(String[] args) {
        Persistence filePersistenceObj = new FilePersistence();
        Persistence dbPersistenceObj = new DatabasePersistence();
        System.out.println(filePersistenceObj.persist());
        System.out.println(dbPersistenceObj.persist());

    }
}
