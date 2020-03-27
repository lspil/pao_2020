package exemplu1;

public class Exemplu1 {

    public static void main(String[] args) {
        doSmth(-10);
    }

    public static void doSmth(int n) {
        if (n < 0) {
            MyRuntimeException e = new MyRuntimeException();
            throw e; // semnalarea aparitiei situatiei exceptionale
        }

        System.out.println(n);
    }
}
