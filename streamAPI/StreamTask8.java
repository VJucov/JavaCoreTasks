package streamAPI;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamTask8 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\VJucov\\text.txt";

        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
