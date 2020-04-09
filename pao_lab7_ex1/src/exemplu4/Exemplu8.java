package exemplu4;

import java.util.*;
import java.util.stream.Collectors;

public class Exemplu8 {

    public static void main(String[] args) {

        Automobil a1 = new Automobil("ABC", "BMW", 1000, 5000);
        Automobil a2 = new Automobil("ZXC", "BMW", 2500, 6000);
        Automobil a3 = new Automobil("WSX", "WSX", 1200, 1500);
        Automobil a4 = new Automobil("EEE", "RRR", 1000, 6000);

        List<Automobil> list = Arrays.asList(a1,a2,a3,a4);

        Comparator<Automobil> c1 = (au1,au2) -> {
            if (au2.getPret() > au1.getPret()) {
                return 1;
            } else if (au2.getPret() < au1.getPret()) {
                return -1;
            }
            return 0;
        };

//        list.stream()
//            .filter(a -> a.getPret() >= 5000)
//            .sorted(c1)
//            .forEach(a -> System.out.println(a));

//        list.stream()
//            .map(a -> a.getMarca())
//            .distinct()
//            .forEach(a -> System.out.println(a));

//        List<Automobil> res =
//            list.stream()
//                .filter(a -> a.getCapacitate() >= 2000)
//                .filter(a -> a.getCapacitate() <= 3000)
//                .collect(Collectors.toList());
//
//        System.out.println(res);

        Map<String, Set<String>> map =
        list.stream()
                .collect(Collectors.groupingBy(a -> a.getMarca(),
                            Collectors.mapping(a -> a.getModel(),
                                Collectors.toSet())));

        System.out.println(map);
    }
}
