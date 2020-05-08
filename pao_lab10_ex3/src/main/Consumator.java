package main;

import java.util.Random;

public class Consumator extends Thread {

    public Consumator(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Main.list) {
                if (!Main.list.isEmpty()) {
                    int x = Main.list.get(0);
                    Main.list.remove(0);
                    System.out.println("Consumatorul " + getName() +
                            " a eliminat valoarea " + x);
                }
            }
        }
    }
}
