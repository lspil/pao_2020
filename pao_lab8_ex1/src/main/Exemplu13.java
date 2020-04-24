package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu13 {

    public static void main(String[] args) {
        // sursa
        // 0 ... n op intermediare
        // op terminala
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

//        List<Integer> res = new ArrayList<>();
//        list.stream()  // [1,2,3,4,5,6,7,8,9]
//            .forEach(x -> res.add(2 * x));
//
//        System.out.println(res);

        List<Integer> res =
            list.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());

    }

}
