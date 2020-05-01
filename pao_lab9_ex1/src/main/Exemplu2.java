package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu2 {

    public static void main(String[] args) {
        List<String> list1 = List.of("ABC", "AAAAAAA", "QWERT", "ASDFG", "A", "FF");

//        list1.stream() // ["ABC", "AAAAAAA", "QWERT", "ASDFG", "A", "FF"]
//            .map(s -> s.length()) // [3,7,5,5,1,2]
//            .forEach(System.out::println);

        long nr =
            list1.stream() // ["ABC", "AAAAAAA", "QWERT", "ASDFG", "A", "FF"]
                 .flatMap(s -> Arrays.stream(s.split("")))  // ["A" "B" "C" "A" "A" A" ...]
                 .filter(c -> c.equals("A"))
                 .count();

        System.out.println(nr);

        List<List<Integer>> list2 =
                List.of(List.of(2,4,6),List.of(4,5), List.of(7));
        // [ [2,4,6], [4,5], [7] ]

        int sum =
            list2.stream()  // [2,4,6], [4,5], [7]
                 .flatMap(q -> q.stream()) // 2,4,6,4,5,7
                 .reduce(0 , (a,b) -> a + b);

        System.out.println(sum);
    }
}
