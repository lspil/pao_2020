package exemplu3;

public class B extends A {

    // overloading (supracincarcare) vs overriding (suprascriere)
    @Override
    Integer m1(String x) {
        System.out.println("B");
        return 0;
    }
}
