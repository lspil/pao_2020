package main;

import java.util.Collections;
import java.util.List;

public class Exemplu5 {

    public static void main(String[] args) {
        List<String> list = List.of("AAAAA", "BBB", "C", "DD", "EEERDS", "QWERTY");


        list.stream() // ["AAAAA", "BBB", "C", "DD", "EEERDS", "QWERTY"]
            .sorted(Collections.reverseOrder())
            .forEach(x -> System.out.println(x));

    }
}
