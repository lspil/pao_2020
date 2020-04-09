package exemplu3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Exemplu7 {

    public static void main(String[] args) {
        // (K1,V), (K2,V)
        Map<Integer, String> map1 = new HashMap<>();
        // LinkedHashMap, TreeMap

        map1.put(1, ":)");
        map1.put(30, ":|");
        map1.put(90, ":)");
        map1.put(80, ":(");
        map1.put(1, ":("); // ultimul apel suprascrie valoarea

//        Set<Integer> keySet = map1.keySet();
//        for (Integer k : keySet) {
//            System.out.println(k + " " + map1.get(k));
//        }

        map1.forEach((k,v) -> System.out.println(k));

        Set<Integer> keySet = map1.keySet();
        List<Integer> list =
                keySet.stream()
                        .sorted()
                        .collect(Collectors.toList());

        System.out.println(list);

    }
}
