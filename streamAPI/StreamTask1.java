package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> listMultipliedBy2 = list.stream().map(it -> it*2).collect(Collectors.toList());
        System.out.println(listMultipliedBy2);
    }

}
