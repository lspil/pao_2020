package exemplu2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemplu4 {

    public static void main(String[] args) {
        // set NU admite duplicate, set NU este ordonat, set NU este indexat
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new TreeSet<>(); // set SORTAT
        Set<Integer> set3 = new LinkedHashSet<>(); // set ORDONAT , pastreaza ordinea in care adaugati voi valorile

        set1.add(345);
        set1.add(32);
        set1.add(6);
        set1.add(1);
        set1.add(455);
        set1.add(455); // valoarea asta NU o sa apara

        // NU putem sa il parcurgem cu for(int i=0 ...)

        for (Integer x : set1) {
            System.out.println(x);
        }

//        set1.forEach(x -> System.out.println(x));

    }
}
