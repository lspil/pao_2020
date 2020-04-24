package main;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu7 {

    public static void main(String[] args) {
        List<String> list = List.of("AAAAA", "BBB", "C", "DD", "EEERDS", "QWERTY");


        List<Integer> res =
            list.stream() // ["AAAAA", "BBB", "C", "DD", "EEERDS", "QWERTY"]
                .map(s -> s.length()) // [5,3,1,2,6,6]
                .collect(Collectors.toList());

        System.out.println(res);
    }
}
