package exemplu1;

public class Exemplu3 {

    public static void main(String[] args) {
        Runnable target = new OddNumberPrinter();
        Thread t = new Thread(target);
        t.start();
    }
}
