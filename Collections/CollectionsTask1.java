package Collections;

import java.util.*;

public class CollectionsTask1 {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(3,5,7,11,13);
        List<Integer> b = Arrays.asList(1,2,3,4,5,6);

        List<Integer> merged = new ArrayList<>(a);
        merged.addAll(b);

        Set<Integer> set = new LinkedHashSet<>(merged);
        merged.clear();
        merged.addAll(set);

        System.out.println("List 1: " + a);
        System.out.println("List 2: " + b);
        System.out.println("Merged list: " + merged);
    }
}
