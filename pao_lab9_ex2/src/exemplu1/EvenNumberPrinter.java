package exemplu1;

public class EvenNumberPrinter extends Thread {

    @Override // run este pt un Thread cum este main() pentru thread-ul principal
    public void run() {
        for (int i=0; i<=10; i+=2) {
            System.out.println(Thread.currentThread().getName() + " " + i); // thread-0
        }
    }
}
