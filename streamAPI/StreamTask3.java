package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamTask3 {

    public static Object returnElement(List<Object> list, int n) {
        return list.stream().filter(it -> list.indexOf(it) == n).findAny().orElse("");
    }

    public static void main(String[] args) {
        List<Object> list = Arrays.asList("Zero element", "First element", "Second element", "Third element");
        System.out.println(returnElement(list, 1).toString());
    }
}
