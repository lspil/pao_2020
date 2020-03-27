package exemplu3;

public class Exemplu3 {

    public static void main(String[] args) {
        int x = m();

        System.out.println(x); // 30
    }

    public static int m() {
        try {
            return 10;
        } catch (RuntimeException e) {
            return 20;
        } finally {
            return 30;
        }
    }
}
