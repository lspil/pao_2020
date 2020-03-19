package exemplu4;

import java.util.Arrays;
import java.util.Comparator;

public class Exemplu4 {

    public static void main(String[] args) {
        Dog [] v = {
          new Dog(2),
          new Dog(1),
          new Dog(4)
        };

        Comparator<Dog> c1 = new Comparator<Dog>() { // clasa anonima
            @Override
            public int compare(Dog d1, Dog d2) {
                return d2.getAge() - d1.getAge();
            }
        };

        Comparator<Dog> c2 = (d1 ,d2) -> d2.getAge() - d1.getAge();

        Arrays.sort(v, new MyComparator());

        for (Dog d : v) {
            System.out.println(d);
        }
    }
}
