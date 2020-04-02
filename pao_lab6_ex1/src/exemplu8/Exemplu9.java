package exemplu8;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Exemplu9 {

    public static void main(String[] args) {
        try {
            PrintStream out = new PrintStream("abc.txt");

            out.println(":)");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
