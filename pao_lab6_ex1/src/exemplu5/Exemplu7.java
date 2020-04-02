package exemplu5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exemplu7 {

    public static void main(String[] args) {
        var p1 = Paths.get("exemplu.txt");

        try {
            byte [] list = Files.readAllBytes(p1);
            //
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
