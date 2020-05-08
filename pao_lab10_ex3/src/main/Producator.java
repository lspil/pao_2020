package main;

import java.util.Random;

public class Producator extends Thread {

    public Producator(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            synchronized (Main.list) {
                if (Main.list.size() < 100) {
                    int x = r.nextInt(1000);
                    Main.list.add(x);
                    System.out.println("Producatorul " + getName() +
                            " a adaugat valoarea " + x);
                }
            }
        }
    }
}
