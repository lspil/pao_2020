package main;

import java.util.List;
import java.util.stream.Collectors;

public class Exemplu14 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> res =
            list.stream()
                .takeWhile(x -> x % 2 == 1)
                .map(x -> x * 2)
                .collect(Collectors.toList());

    }

}
