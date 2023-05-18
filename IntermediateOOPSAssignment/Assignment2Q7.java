package IntermediateOOPSAssignment;

import java.util.Scanner;

abstract class DesertItem {
    abstract public int getCost();
}
class Candy extends DesertItem {
    private int totalCandies = 0;
    public int addCandies(int candies){
        totalCandies += candies;
        return totalCandies;
    }
    public int getCost(){
        return 60 * totalCandies;
    }
}
class Cookie extends DesertItem {
    private int totalCookies = 0;
    public int addCookies(int candies){
        totalCookies += candies;
        return totalCookies;
    }
    public int getCost(){
        return 70 * totalCookies;
    }
}
class IceCream extends DesertItem {
    private int totalIceCream = 0;
    public int addIceCreams(int candies){
        totalIceCream += candies;
        return totalIceCream;
    }
    public int getCost(){
        return totalIceCream;
    }
}
public class Assignment2Q7 {
    static Assignment2Q7 obj = new Assignment2Q7();
    public static void main(String[] args) {
        obj.selectRoles();
    }
    private void selectRoles(){
        System.out.println("Owner");
        System.out.println("Customer");
        System.out.println("Enter your role: ");
        Scanner sc = new Scanner(System.in);
        String role = sc.next();
        obj.roles(role);
    }
    private void roles(String role){
        if(role.equals("Owner")){
            obj.addItems();
        }
        else{
            obj.placeOrder();
        }
    }
    private void addItems() {
        System.out.println("1.Candy");
        System.out.println("2.Cookie");
        System.out.println("3.IceCream");
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        obj.addItemsOperation(choice);
    }
    private void addItemsOperation(int choice) {
        Scanner sc = new Scanner(System.in);
        if(choice == 1){
            Candy candyObj = new Candy();
            System.out.println("Enter number of candies:");
            int numOfCandies = sc.nextInt();
            candyObj.addCandies(numOfCandies);
        }
        else if(choice == 2){
            Cookie cookieObj = new Cookie();
            System.out.println("Enter number of cookies:");
            int numOfCookie = sc.nextInt();
            cookieObj.addCookies(numOfCookie);
        }
        else{
            IceCream iceCreamObj = new IceCream();
            System.out.println("Enter number of IceCream:");
            int numOfIceCream = sc.nextInt();
            iceCreamObj.addIceCreams(numOfIceCream);
        }
    }
    private void placeOrder() {
        System.out.println("1.Candy");
        System.out.println("2.Cookie");
        System.out.println("3.IceCream");
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        obj.placeOrderOperation(choice);
    }
    private void placeOrderOperation(int choice) {
        Scanner sc = new Scanner(System.in);
        if(choice == 1){
            Candy candyObj = new Candy();
            System.out.println(candyObj.getCost());
        }
        else if(choice == 2){
            Cookie cookieObj = new Cookie();
            System.out.println(cookieObj.getCost());
        }
        else{
            IceCream iceCreamObj = new IceCream();
            System.out.println(iceCreamObj.getCost());
        }
    }
}
