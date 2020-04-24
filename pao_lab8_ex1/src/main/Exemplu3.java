package main;

import java.util.List;

public class Exemplu3 {

    public static void main(String[] args) {
        // sursa
        // 0 ... n op intermediare
        // op terminala
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,2,4);

        int res1 =
            list.stream()  // [1,2,3,4,5,6,7,8,9]
                .filter(x -> x % 2 == 0)  //  [2,4,6,8,2,4]
                .distinct() // [2,4,6,8]
                .reduce(0, (a,b) -> a+b); // 20

        System.out.println(res1);
    }
}
