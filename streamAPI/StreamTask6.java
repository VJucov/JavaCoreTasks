package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamTask6 {
    public static void main(String[] args) {
        List<Character> list = Arrays.asList('a', 'b', 'c', 'd', 'e');

        Character max = list.stream().max(Character::compare).get();
        System.out.println("The maximum character is: " + max);

        Character min = list.stream().min(Character::compare).get();
        System.out.println("The minimum character is: " + min);
    }
}
