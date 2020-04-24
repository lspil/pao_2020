package main;

import java.util.List;

public class Exemplu4 {

    public static void main(String[] args) {
        List<String> list = List.of("AAAAA", "BBB", "C", "DD", "EEERDS", "QWERTY");

        int res =
            list.stream() // ["AAAAA", "BBB", "C", "DD", "EEERDS", "QWERTY"]
                .map(x -> x.length())  //  [5,3,1,2,6,6]
                .distinct() // [5,3,1,2,6]
                .reduce(0, (a,b) -> a + b); // 17

        System.out.println(res);
    }
}
