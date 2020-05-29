package exemplu3;

public class Cat implements Comparable<Cat> {

    int age;

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {
        if (this.age < o.age) return -1;
        if (this.age > o.age) return 1;
        return 0;
    }
}
