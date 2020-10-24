package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask4 {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4");
        List listOfIntegers = listOfStrings.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(listOfIntegers);
    }
}
