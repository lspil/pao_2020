package exemplu1;

public class Exemplu1 {

    public static void main(String[] args) {
        try {
            // throw e2;
        } catch (E3 e) {

        } catch (RuntimeException e) {

        } finally {

        }
    }

    class E1 extends RuntimeException {

    }

    class E2 extends RuntimeException {

    }

    class E3 extends E2 {

    }
}
