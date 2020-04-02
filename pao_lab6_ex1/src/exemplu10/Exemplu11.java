package exemplu10;

import java.io.*;

public class Exemplu11 {

    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("pisica.dat")
        )) {
            Cat c1 = (Cat) in.readObject();
            System.out.println(c1.getName() + " " + c1.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // JSON -> Jackson, Gson
        // XML -> JAX-B
    }
}
