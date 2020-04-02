package exemplu5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exemplu6 {

    public static void main(String[] args) {
        var p1 = Paths.get("exemplu.txt");

        try {
            var list = Files.readAllLines(p1);

            list.forEach(line -> System.out.println(line));

//            for (String line : list) {
//                System.out.println(line);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
