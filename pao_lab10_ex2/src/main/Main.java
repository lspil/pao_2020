package main;

import main.exceptions.CountingWordsException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {
        String s1 = "C:\\COURSES\\pao_lab10_ex1\\src\\file1.txt";
        String s2 = "C:\\COURSES\\pao_lab10_ex1\\src\\file2.txt";
        int n = 4;

        List<String> files = List.of(s1,s2);

        ExecutorService service = Executors.newFixedThreadPool(4);

        List<Future<Long>> results = new ArrayList<>();
        for (String f : files) {
            Future<Long> r = service.submit(new CountWordsFromFile(f, n));
            results.add(r);
        }

        int sum = 0;
        for (Future<Long> f : results) {
            try {
                sum += f.get(); // cand se termina taskul pe thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        service.shutdown();

        System.out.println(sum);
    }
}
