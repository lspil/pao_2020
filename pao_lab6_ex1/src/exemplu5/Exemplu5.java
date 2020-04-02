package exemplu5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu5 {

    public static void main(String[] args) {
        var p1 = Paths.get("exemplu.txt"); // var incepand cu java 10

        try (var in = Files.newBufferedReader(p1)) {
            String line;
            while ( (line = in.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
