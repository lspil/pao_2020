package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu1 {

    public static void main(String[] args) {
        List<DiplomaLicenta> list = new ArrayList<>();

        DiplomaLicenta d1 = new DiplomaLicenta();
        d1.setAbsolvent("Gigel");
        d1.setAn(2018);
        d1.setFacultate("FMI");
        d1.setMedie(9.1);
        d1.setSerie("123");
        d1.setSpecializare("matematica");

        DiplomaLicenta d2 = new DiplomaLicenta();
        d2.setAbsolvent("Dorel");
        d2.setAn(2018);
        d2.setFacultate("FMI");
        d2.setMedie(9.3);
        d2.setSerie("123");
        d2.setSpecializare("informatica");

        DiplomaLicenta d3 = new DiplomaLicenta();
        d3.setAbsolvent("Maria");
        d3.setAn(2018);
        d3.setFacultate("FMI");
        d3.setMedie(10);
        d3.setSerie("124");
        d3.setSpecializare("matematica");

        list.add(d1);
        list.add(d2);
        list.add(d3);

        list.stream()
            .filter(d -> d.getAn() >= 2000)
            .filter(d -> d.getAn() <= 2010)
            .sorted((a1,a2) -> {
                if (a1.getMedie() < a2.getMedie()) {
                    return 1;
                } else if (a1.getMedie() > a2.getMedie()) {
                    return -1;
                }
                return 0;
            })
            .forEach(System.out::println);

        System.out.println("=================================");


        list.stream()
            .filter(d -> d.getAn() == 2018)
            .map(d -> d.getSpecializare())
            .distinct()
            .forEach(System.out::println);

        System.out.println("=================================");

        List<String> nume =
            list.stream()
                .filter(d -> d.getMedie() == 10)
                .map(d -> d.getAbsolvent())
                .collect(Collectors.toList());

        System.out.println(nume);

        System.out.println("=================================");

        long nr =
            list.stream()
                    .filter(d -> d.getSpecializare()
                            .equalsIgnoreCase("informatica"))
                    .count();

        System.out.println(nr);
    }
}
