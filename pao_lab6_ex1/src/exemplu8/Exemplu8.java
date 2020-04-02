package exemplu8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu8 {

    public static void main(String[] args) {
        Path p1 = Paths.get("test.txt");

        try (var out = Files.newBufferedWriter(p1)) {
             out.write("HELLO WORLD!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
