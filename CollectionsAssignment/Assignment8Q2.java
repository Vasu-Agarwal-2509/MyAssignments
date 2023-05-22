package CollectionsAssignment;

import java.util.*;

public class Assignment8Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //By using HashSet
        Set<Integer> set = new HashSet<>();
        while(set.size() != 10){
            int val = sc.nextInt();
            set.add(val);
        }
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }


        //By using TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        while(treeSet.size() != 10){
            int val = sc.nextInt();
            treeSet.add(val);
        }
        Iterator it1 = treeSet.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

    }
}
