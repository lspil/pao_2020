package exemplu1;

public class Examplu1 {

    public static void main(String[] args) {
        EvenNumberPrinter t1 = new EvenNumberPrinter();
        t1.run();
        System.out.println(Thread.currentThread().getName() + " THE END :)"); // main
    }
}
