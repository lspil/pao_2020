package exemplu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exemplu5 {

    public static void main(String[] args) {
        Dog c1 = new Dog(4);
        Dog c2 = new Dog(1);
        Dog c3 = new Dog(2);

        List<Dog> cats = new ArrayList<>();

        cats.add(c1); cats.add(c2); cats.add(c3);

        Comparator<Dog> comp = (d1,d2) -> {
            if (d1.age < d2.age) return -1;
            if (d1.age > d2.age) return 1;
            return 0;
        };
        Collections.sort(cats, comp);

        cats.forEach(c -> System.out.println(c.age));
    }
}
