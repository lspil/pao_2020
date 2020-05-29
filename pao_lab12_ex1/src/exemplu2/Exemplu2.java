package exemplu2;

public class Exemplu2 {

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new B();
        B b1 = new B();

        a1.m(); // A // non-static conteaza instanta
        a2.m(); // B
        b1.m(); // B

        a1.n(); // A daca metoda e statica conteaza tipul variabilei
        a2.n(); // A
        b1.n(); // B

        b1.q(); // compileaza
//        a2.q();  nu compileaza
    }
}
