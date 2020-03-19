package exemplu3;

public class Cat implements Comparable<Cat> {

    private int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {
        // this ~ o
        // this < o   valoare negativa
        // this == o  zero
        // this > o   valoare pozitiva
        if (this.age > o.age) {
            return -1;
        } else if (this.age < o.age) {
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
