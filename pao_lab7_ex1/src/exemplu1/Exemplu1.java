package exemplu1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exemplu1 {
    /*
    List, Set, Map, Deque, Queue

    List<E>, Set<E>, Map<K,V>

    List<E> -> ArrayList<E>   / LinkedList<E>
    Set<E> -> HashSet<E>, TreeSet<E>  / LinkedHashSet<E>
    Map<E> -> HashMap<K,V>, TreeMap<K,V> / LinkedHashMap<K,V>

    Hashtable<K,V>, Vector<E> --> legacy, ffff vechi
     */

    public static void main(String[] args) {
        // List  ->  admit duplicate, ordonate (nu neaparat sortate), indexate
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>(); // nu o sa o folosesc
        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list4 = List.of(2,5,6,8,9); // >= 9

        list1.add(10);
        list1.add(30);

        for (int i = 0; i < list1.size(); i++) {
            Integer x = list1.get(i);
            // x
            System.out.println(x);
        }

        for (var y : list1) { // java 10 minim
            System.out.println(y);
        }


    }
}
