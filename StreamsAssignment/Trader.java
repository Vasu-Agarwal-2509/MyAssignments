package StreamsAssignment;

public class Trader {
    String name;
    String city;
    public Trader(String name, String city){
        this.name = name;
        this.city = city;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String toString(){
        return name + " " + city;
    }
}
