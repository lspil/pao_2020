package main;

import main.exceptions.CountingWordsException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class CountWordsFromFile implements Callable<Long> {

    private final String file;
    private final int n;

    public CountWordsFromFile(String file, int n) {
        this.file = file;
        this.n = n;
    }

    public long countWords() {
        Path path = Paths.get(file);

        try {
            return Files.lines(path) // "So close no matter how far"
                 .flatMap(s -> Arrays.stream(s.split(" ")))  // "So" "close" "no" ...
                 .filter(c -> c.length() == n)
                 .count();
        } catch (IOException e) {
            throw new CountingWordsException();
        }

    }

    @Override
    public Long call() {
        System.out.println(Thread.currentThread().getName());
        return countWords();
    }
}
