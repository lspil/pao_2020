package main;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu9 {

    public static void main(String[] args) {
        List<String> list = List.of("AAAAA", "BBB", "C", "DD", "EEERDS", "QWERTY");


        long res =
            list.stream() // ["AAAAA", "BBB", "C", "DD", "EEERDS", "QWERTY"]
                .filter(s -> s.length() % 2 == 0)
                .collect(Collectors.counting()); // 3

        System.out.println(res);
    }
}
