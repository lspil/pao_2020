package main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu17 {

    public static void main(String[] args) {
        List<String> list = List.of("AAAA", "BB", "C", "DDDDDD", "AADD", "EE");



        Map<Integer, Long> res =
            list.stream()
                .collect(Collectors.groupingBy(s -> s.length(),
                        // 1 [CC]
                        // 2 [BB, EE]
                        // 4 [AAAA, AADD]
                        // 6 [DDDDDD]
                            Collectors.mapping(s -> s.length(),
                        // 1 [2]
                        // 2 [2, 2]
                        // 4 [4, 4]
                        // 6 [6]
                            Collectors.counting())));
                        // 1 1
                        // 2 2
                        // 4 2
                        // 6 1

        System.out.println(res);

    }

}
