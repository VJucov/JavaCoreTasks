package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTask7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,3,4,5,6,7,8,8,9);

        List<Integer> listWithoutDuplicates1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println("List without duplicates: " + listWithoutDuplicates1);

        Set<Integer> listWithoutDuplicates2 = list.stream().collect(Collectors.toSet());
        System.out.println("List without duplicates: " + listWithoutDuplicates2);

        Map<Integer, Integer> listWithoutDuplicates3 = list.stream().collect(Collectors.toMap(Function.identity(), it -> 1, Integer::sum));
        System.out.println("List without duplicates: " + listWithoutDuplicates3);

    }
}
