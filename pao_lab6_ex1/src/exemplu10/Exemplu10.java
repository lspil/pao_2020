package exemplu10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exemplu10 {

    public static void main(String[] args) {
        Cat c1 = new Cat("Tom", 1);

        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("pisica.dat")
        )) {
            out.writeObject(c1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
