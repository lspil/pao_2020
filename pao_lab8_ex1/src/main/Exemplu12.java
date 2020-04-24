package main;

import java.util.List;

public class Exemplu12 {

    public static void main(String[] args) {
        // sursa
        // 0 ... n op intermediare
        // op terminala
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        list.stream()  // [1,2,3,4,5,6,7,8,9]
                .forEach(x -> System.out.println(multiply(x, 2)));

    }

    static int multiply(int x, int y) {
        return x * y;
    }
}
