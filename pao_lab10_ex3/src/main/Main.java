package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        var p1 = new Producator("P1");
        var p2 = new Producator("P2");
        var p3 = new Producator("P3");

        var c1 = new Consumator("C1");
        var c2 = new Consumator("C2");
        var c3 = new Consumator("C3");

        p1.start();
        p2.start();
        p3.start();

        c1.start();
        c2.start();
        c3.start();
    }
}
