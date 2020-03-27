package exemplu1;

public class Exemplu2 {

    public static void main(String[] args) {
        try {
            doSmth(-10);
            System.out.println(":)");
        } catch (MyACheckedException | MyBCheckedException e) {
            //e.printStackTrace();
            System.out.println(":(");
        } finally {
            // se executa intotdeauna
            System.out.println(":|");
        }

    }

    public static void doSmth(int n)
            throws MyACheckedException,
                   MyBCheckedException {
        if (n < 0) {
            MyACheckedException e = new MyACheckedException();
            throw e; // semnalarea aparitiei situatiei exceptionale
        }

        if (n > 100) {
            MyBCheckedException e = new MyBCheckedException();
            throw e;
        }

        System.out.println(n);
    }
}
