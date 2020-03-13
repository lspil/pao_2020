package exemplu1;

// isA - este un/o
public class B extends A {
    // 1 sa adauge noi atribute - fields
    // 2 sa adauge noi comportamente - metode
    // 3 sa modifice atribute - hiding fields
    // 4 sa modifice metode - overriding
    int y;
    String x; // x din B il ascunde pe cel din clasa A

    void m1() {
        System.out.println("B");
    }

    void m2() {

    }
}
