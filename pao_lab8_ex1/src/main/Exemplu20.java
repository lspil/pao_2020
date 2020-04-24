package main;

import java.io.Serializable;

public class Exemplu20 {
    static class Persoana {

        Persoana() {
            System.out.println("Persoana");
        }
    }

    static class Angajat extends Persoana implements Serializable {

        Angajat() {
            System.out.println("Angajat");
        }
    }

    public static void main(String[] args) {
        Angajat a = new Angajat();

        // salvez in fisier
        // citesc din fisier


    }
}
