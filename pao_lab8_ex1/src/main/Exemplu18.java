package main;

import java.util.HashSet;
import java.util.Objects;

public class Exemplu18 {

    public static void main(String[] args) {
//        HashSet<Automobil> set = new HashSet<>();
//        set.add(new Automobil("BMW"));
//        set.add(new Automobil("DACIA"));
//        set.add(new Automobil("AUDI"));
//        set.add(new Automobil("ALtCEVA"));
//
//        System.out.println(set.size());

        Persoana p1 = new Persoana("N", "P");
        p1 = new Persoana("N2", "P2");
        p1 = new Persoana("N3", "P3");
        p1 = new Persoana("N4", "P4");
        p1 = new Persoana("N5", "P5");

    }

    static class Automobil {
        String marca;

        public Automobil(String marca) {
            this.marca = marca;
        }

        @Override
        public boolean equals(Object o) {
            return true;
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }

    static class Persoana {
        final String nume;
        final String prenume;

        public Persoana(String nume, String prenume) {
            this.nume = nume;
            this.prenume = prenume;
        }
    }
}
