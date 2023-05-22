package StreamsAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment7Q2 {
    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
        List<Fruit> lowCalorieList = fruits.stream().filter(x -> (x.getCalories() < 100)).sorted(new SortByCalories()).collect(Collectors.toList());
        List<String> fruitNameList = new ArrayList<>();
        lowCalorieList.forEach(obj -> fruitNameList.add(obj.getName()));
        return fruitNameList;
    }
    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) {
        List<Fruit> colorWiseList = fruits.stream().sorted(new SortByColor()).collect(Collectors.toList());
        ArrayList<Fruit> colorList = new ArrayList<>();
        colorWiseList.forEach(obj -> colorList.add(obj));
        return colorList;
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
        List<Fruit> sortedByPriceList = fruits.stream().filter(x -> x.getColor().equals("Red")).sorted(new SortByPrice()).collect(Collectors.toList());
        ArrayList<Fruit> filteredList = new ArrayList<>();
        sortedByPriceList.forEach(obj -> filteredList.add(obj));
        return filteredList;
    }

    public static void main(String[] args) {
        Fruit fruitObj1 = new Fruit("Apple",52,140, "Red");
        Fruit fruitOnj2 = new Fruit("Banana", 96, 40, "Yellow");
        Fruit fruitObj3 = new Fruit("Orange", 62, 100, "Orange");
        Fruit fruitObj4 = new Fruit("Grapes", 69, 50, "Green");
        Fruit fruitObj5 = new Fruit("Strawberry", 29, 150, "Red");

        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(fruitObj1);
        fruitList.add(fruitOnj2);
        fruitList.add(fruitObj3);
        fruitList.add(fruitObj4);
        fruitList.add(fruitObj5);

        System.out.println("1. Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.");
        List<String> fruitListObtained = reverseSort(fruitList);
        for (String fruitName: fruitListObtained) {
            System.out.println(fruitName);
        }

        System.out.println("2. Display color wise list of fruit names.");
        ArrayList<Fruit> colorListObtained = sort(fruitList);
        colorListObtained.stream().forEach(x -> System.out.println(x.getName() + " " + x.getColor()));

        System.out.println("3. Display only RED color fruits sorted as per their price in ascending order.");
        ArrayList<Fruit> filteredListByPriceObtained = filterRedSortPrice(fruitList);
        filteredListByPriceObtained.forEach(x -> System.out.println(x));
    }
}
