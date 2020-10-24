package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamTask5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,8,10,14,17,20);

        Integer max = list.stream().max(Integer::compare).get();
        System.out.println("The maximum element is: " + max);

        Integer min = list.stream().min(Integer::compare).get();
        System.out.println("The minimum element is: " + min);
    }
}
