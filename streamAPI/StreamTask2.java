package streamAPI;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTask2 {

    public static String reverse(String str) {
        return Stream.of(str).map(it -> new StringBuilder(it).reverse()).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text line: ");
        String str = input.nextLine();
        System.out.println("Reversed text: " + reverse(str));
    }
}