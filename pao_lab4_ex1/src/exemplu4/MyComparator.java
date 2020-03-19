package exemplu4;

import java.util.Comparator;

public class MyComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog d1, Dog d2) {
        return d1.getAge() - d2.getAge();
    }
}
