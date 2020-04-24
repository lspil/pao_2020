package main;

import java.util.List;

public class Exemplu1 {

    public static void main(String[] args) {
        // sursa
        // 0 ... n op intermediare
        // op terminala
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        int res1 =
            list.stream()  // [1,2,3,4,5,6,7,8,9]
                .reduce(0, (a,b) -> a+b);

        System.out.println(res1);
    }
}
