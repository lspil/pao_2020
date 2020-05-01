package exemplu1;

public class Exemplu2 {

    public static void main(String[] args) throws Exception {
        T1 t = new T1();
        t.start();

        Thread.sleep(3000);

        t.interrupt(); // main il opreste pe T
    }

    public static class T1 extends Thread {
        public void run() {
            try {
                Thread.sleep(1000 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
