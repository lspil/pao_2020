package main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu15 {

    public static void main(String[] args) {
        List<String> list = List.of("AAAA", "BB", "C", "DDDDDD", "AADD", "EE");

        // 1 [CC]
        // 2 [BB, EE]
        // 4 [AAAA, AADD]
        // 6 [DDDDDD]

        Map<Integer, List<String>> res =
            list.stream()
                .collect(Collectors.groupingBy(s -> s.length()));

        System.out.println(res);

    }

}
