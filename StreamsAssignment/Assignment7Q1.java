package StreamsAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment7Q1 {
    public static void main(String[] args) {
        Fruit fruitObj1 = new Fruit("Apple",52,140, "Red");
        Fruit fruitOnj2 = new Fruit("Banana", 96, 40, "Yellow");
        Fruit fruitObj3 = new Fruit("Orange", 62, 100, "Orange");
        Fruit fruitObj4 = new Fruit("Grapes", 69, 50, "Green");
        Fruit fruitObj5 = new Fruit("Strawberry", 29, 150, "Red");

        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(fruitObj1);
        fruitList.add(fruitOnj2);
        fruitList.add(fruitObj3);
        fruitList.add(fruitObj4);
        fruitList.add(fruitObj5);

        Trader traderObj1 = new Trader("JohnSmith", "New York City");
        Trader traderObj2 = new Trader("MariaLopez", "Pune");
        Trader traderObj3 = new Trader("AhmedKhan", "Delhi");
        Trader traderObj4 = new Trader("SophieMartin", "Pune");
        Trader traderObj5 = new Trader("LiuWei", "Pune");

        List<Trader> traderList = new ArrayList<>();
        traderList.add(traderObj1);
        traderList.add(traderObj2);
        traderList.add(traderObj3);
        traderList.add(traderObj4);
        traderList.add(traderObj5);

        Transaction transactionObj1 = new Transaction(traderObj1, 2001, 200);
        Transaction transactionObj2 = new Transaction(traderObj2, 2011, 500);
        Transaction transactionOnj3 = new Transaction(traderObj3, 2003, 300);
        Transaction transactionOnj4 = new Transaction(traderObj4, 2011, 700);
        Transaction transactionObj5 = new Transaction(traderObj5, 2011, 900);

        List<Transaction> transactionsList = new ArrayList<>();
        transactionsList.add(transactionObj1);
        transactionsList.add(transactionObj2);
        transactionsList.add(transactionOnj3);
        transactionsList.add(transactionOnj4);
        transactionsList.add(transactionObj5);

        System.out.println("1. Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.");
        List<Fruit> lowCalorieList = fruitList.stream().filter(x -> (x.getCalories() < 100)).sorted(new SortByCalories()).collect(Collectors.toList());
        for (Fruit fruitObj: lowCalorieList) {
            System.out.println(fruitObj);
        }

        System.out.println("2. Display color wise list of fruit names.");
        fruitList.stream().forEach(x -> System.out.println(x.getName() + " " + x.getColor()));
//        for (Fruit fruitObj : fruitList) {
//            System.out.println(fruitObj.name + " " + fruitObj.color);
//        }

        System.out.println("3. Display only RED color fruits sorted as per their price in ascending order.");
        List<Fruit> sortedByPriceList = fruitList.stream().filter(x -> x.getColor().equals("Red")).sorted(new SortByPrice()).collect(Collectors.toList());
        for(Fruit fruitObj : sortedByPriceList){
            System.out.println(fruitObj);
        }

        System.out.println("8. Find all transactions in the year 2011 and sort them by value (small to high).");
        List<Transaction> sortedListByValue = transactionsList.stream().filter(x -> (x.year == 2011)).sorted(new SortByValue()).collect(Collectors.toList());
        for(Transaction transactionObj : sortedListByValue){
            System.out.println(transactionObj);
        }

        System.out.println("9. What are all the unique cities where the traders work?");
        HashMap<String,Integer> hm = new HashMap<>();
        for(Trader traderObj : traderList){
            if(!hm.containsKey(traderObj.city))
                hm.put(traderObj.city, 1);
            else
                hm.put(traderObj.city, 2);
        }
        List<Trader> uniqueCitiesList = traderList.stream().filter(x -> hm.get(x.city) == 1).collect(Collectors.toList());
        for(Trader traderObj : uniqueCitiesList){
            System.out.println(traderObj);
        }

        System.out.println("10. Find all traders from Pune and sort them by name.");
        List<Trader> sortedListByName = traderList.stream().filter(x -> x.city.equals("Pune")).sorted(new SortByName()).collect(Collectors.toList());
        for(Trader traderObj : sortedListByName){
            System.out.println(traderObj);
        }

        System.out.println("11. Return a string of all traders names sorted alphabetically.");
        List<Trader> tradersNameList = traderList.stream().sorted(new SortByName()).collect(Collectors.toList());
        String str = "";
        for(Trader traderObj : tradersNameList){
            str += traderObj.name + " ";
        }
        System.out.println(str);

        System.out.println("12. Are any traders based in Indore?");
        List<Trader> traderIndoreList = traderList.stream().filter(x -> x.city.equals("Indore")).collect(Collectors.toList());
        if(traderIndoreList.size() != 0)
            System.out.println("Yes, there are " + traderIndoreList.size() + " in Indore");
        else
            System.out.println("No, there are not any traders based in Indore");

        System.out.println("13. Print all transactions’ values from the traders living in Delhi.");
        List<Transaction> listOfValuesInDelhi = transactionsList.stream().filter(x -> x.trader.city == "Delhi").collect(Collectors.toList());
        for(Transaction transactionObj : listOfValuesInDelhi)
            System.out.println(transactionObj.value);

        System.out.println("14. What’s the highest value of all the transactions?");
        List<Transaction> maxValueList = transactionsList.stream().sorted(new SortByValue()).collect(Collectors.toList());
        System.out.println(maxValueList.get(maxValueList.size() - 1).value);

        System.out.println("15. Find the transaction with the smallest value.");
        List<Transaction> smallestValueList = transactionsList.stream().sorted(new SortByValue()).collect(Collectors.toList());
        System.out.println(smallestValueList.get(0));

    }
}
