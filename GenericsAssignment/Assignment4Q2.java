package GenericsAssignment;

import java.util.HashMap;
import java.util.Random;

public class Assignment4Q2 {
    public static void main(String[] args) {
        Random random = new Random();
        HashMap<Integer,Double> hm = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int key = random.nextInt(20) + 1;
            double value = random.nextDouble(20) + 1;
            hm.put(key, value);
        }
        for (int k: hm.keySet()) {
            System.out.println(k + " " + hm.get(k));
        }
    }
}
