package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu11 {

    public static void main(String[] args) {
        List<String> list = List.of("AAAAA", "BBB", "C", "DD", "EEERDS", "QWERTY");

        // String []

        String res =
            list.stream() // ["AAAAA", "BBB", "C", "DD", "EEERDS", "QWERTY"]
                .flatMap(s -> Arrays.stream(s.split(""))) // A A A A A B B B ...
                .sorted()
                .collect(Collectors.joining(","));

        System.out.println(res);
    }
}
