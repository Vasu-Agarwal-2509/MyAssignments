package StringAssignments;

import java.util.Locale;

public class Assignment6Q1 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length());

        String str1 = "Hello,";
        String str2 = "How are you";
        String str3 = str1 + str2;
        System.out.println(str3);

        String str4 = "Java String pool refers to collection of Strings which are stored in heap memory";
        String str4lowerCase = str4.toLowerCase();
        String str4upperCase = str4.toUpperCase();
        String str5 = str4.replace('a', '$');
        boolean isPresent = str4.contains("collection");
        System.out.println("To LowerCase: " + str4lowerCase);
        System.out.println("To UpperCase: " + str4upperCase);
        System.out.println("String which replaces a with $ " + str5);
        System.out.println(isPresent);
        String strToCheck = "java string pool refers to collection of strings which are stored in heap memory";
        if(str4.equals(strToCheck))
            System.out.println("String are equal");
        else if(str4 == strToCheck)
            System.out.println("String are equal from method 2");
        else
            System.out.println("String are not equal");

    }
}
