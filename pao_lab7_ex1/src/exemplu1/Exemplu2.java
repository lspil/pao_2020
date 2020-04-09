package exemplu1;

import java.util.ArrayList;
import java.util.List;

public class Exemplu2 {

    public static void main(String[] args) {
        List<Cat> list1 = new ArrayList<>();

        list1.add(new Cat(10));
        list1.add(new Cat(5));
        list1.add(new Cat(3));

        list1.forEach(c -> System.out.println(c.getAge()));

        var res1 =
            list1.stream() // Cat
                 .map(c -> c.getAge())   // Cat -> int
                 .reduce(0, (c1,c2) -> c1 + c2); // sum(age)

        System.out.println(res1);
    }
}
