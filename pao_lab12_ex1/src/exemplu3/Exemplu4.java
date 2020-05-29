package exemplu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplu4 {

    public static void main(String[] args) {
        Cat c1 = new Cat(4);
        Cat c2 = new Cat(1);
        Cat c3 = new Cat(2);

        List<Cat> cats = new ArrayList<>();

        cats.add(c1); cats.add(c2); cats.add(c3);

        Collections.sort(cats);

        cats.forEach(c -> System.out.println(c.age));
    }
}
