package main;

import main.exceptions.CountingWordsException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;

public class CountWordsFromFile implements Runnable {

    private final String file;
    private final int n;

    private Optional<Long> result;


    public CountWordsFromFile(String file, int n) {
        this.file = file;
        this.n = n;
        this.result = Optional.empty();
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

    public Optional<Long> getResult() {
        return result;
    }

    @Override
    public void run() {
        try {
            result = Optional.of(countWords());
        } catch (Exception e) {
            Optional.of(0);
        }
    }
}
