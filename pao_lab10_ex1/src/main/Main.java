package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        String s1 = "C:\\COURSES\\pao_lab10_ex1\\src\\file1.txt";
        String s2 = "C:\\COURSES\\pao_lab10_ex1\\src\\file2.txt";
        int n = 4;

        List<String> files = List.of(s1,s2);

        List<CountWordsFromFile> results = new ArrayList<>();
        for (String f : files) {
            CountWordsFromFile c = new CountWordsFromFile(f, n);
            results.add(c);
            Thread t = new Thread(c);
            t.start(); // -> run()
        }

        long sum = 0;
        for (CountWordsFromFile c : results) {
            while (c.getResult().isEmpty()) {
                Thread.sleep(500);
            }
            sum += c.getResult().get();
        }

        System.out.println(sum);
    }
}
