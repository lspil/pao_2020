package main;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountProductThread extends Thread {

    private String file;
    private String product;
    private double res;

    public CountProductThread(String file, String product) {
        this.file = file;
        this.product = product;
    }

    @Override
    public void run() {
        try {
            Path p = Paths.get(file);

            this.res =
                Files.lines(p) // "carlsberg,beer,2,10"
                     .map(raw -> raw.split(","))  // ["carlsberg","beer","2","10"]
                     .filter(raw -> raw[1].equalsIgnoreCase(product)) // ["carlsberg","beer","2","10"]
                     .mapToDouble(raw -> Integer.parseInt(raw[2]) * Double.parseDouble(raw[3])) // 2*10
                     .sum();

        } catch (Exception e) {
            this.res = 0;
        }
    }

    public double getRes() {
        return res;
    }
}
