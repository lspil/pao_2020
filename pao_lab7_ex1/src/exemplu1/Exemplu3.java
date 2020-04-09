package exemplu1;

import java.util.Arrays;
import java.util.List;

public class Exemplu3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,45,67,89,23);

        System.out.println(list); // [23,45,67,89]

        List<Cat> list2 = Arrays.asList(new Cat(10), new Cat(20));
        System.out.println(list2); // [Cat@fcfc23, Cat@eac34c]
    }
}
