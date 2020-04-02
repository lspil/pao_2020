package examplu1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu4 {

    public static void main(String[] args) {
        Path p1 = Paths.get("A/B/C");
        
        try {
            Files.createDirectories(p1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
