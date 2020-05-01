package exemplu1;

public class OddNumberPrinter implements Runnable {

    @Override
    public void run() {
        for (int i=1;i<=10;i+=2) {
            System.out.println(i);
        }
    }
}
