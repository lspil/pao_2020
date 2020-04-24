package main;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu8 {

    public static void main(String[] args) {
        List<String> list = List.of("AAAAA", "BBB", "C", "DD", "EEERDS", "QWERTY");


        String res =
            list.stream() // ["AAAAA", "BBB", "C", "DD", "EEERDS", "QWERTY"]
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining("_")); // AAAAA_BBB_C_DD_EEERDS_QWERTY

        System.out.println(res);
    }
}
