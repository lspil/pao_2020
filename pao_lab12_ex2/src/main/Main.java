package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // INPUT

        String product = "beer";

        String file1 = "C:\\SCHOOLOFJAVA\\pao_lab12_ex2\\src\\magazin_1";
        String file2 = "C:\\SCHOOLOFJAVA\\pao_lab12_ex2\\src\\magazin_2";

        List<String> files = Arrays.asList(file1, file2);

        // RES

        List<CountProductThread> threads = new ArrayList<>();
        for (String f : files) {
            CountProductThread t = new CountProductThread(f, product);
            t.start();
            threads.add(t);
        }

        try {
            for (CountProductThread t : threads) {
                t.join();
            }

            double total = 0;
            for (CountProductThread t : threads) {
                total += t.getRes();
            }

            System.out.println(total);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
