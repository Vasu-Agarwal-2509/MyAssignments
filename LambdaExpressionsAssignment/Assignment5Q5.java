package LambdaExpressionsAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment5Q5 {
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
        Assignment5Q5 obj = new Assignment5Q5();
        System.out.println(processWords(obj.list));
    }

    public static String processWords(List<String> list) {
        StringBuilder str = new StringBuilder();
        Consumer<List<String>> stringConsumer = l -> {
            for (String s : l)
                str.append(s.charAt(0));
        };

        stringConsumer.accept(list);
        return String.valueOf(str);
    }
}
