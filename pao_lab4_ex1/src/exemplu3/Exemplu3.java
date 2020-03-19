package exemplu3;

import java.util.Arrays;

public class Exemplu3 {

    public static void main(String[] args) {
//        int [] v = {4,5,6,3,2,1};

        Cat [] v = {
                new Cat(4),
                new Cat(1),
                new Cat(2)
        };

        Arrays.sort(v);

        for (Cat x : v) {
            System.out.println(x); // exemplu3.Cat@34fce
        }
    }
}
