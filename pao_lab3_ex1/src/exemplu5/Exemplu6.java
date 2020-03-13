package exemplu5;

public class Exemplu6 {

    public static void main(String[] args) {
        Cat c = new Cat();

        c.toString(); // Cat@ff43ed
        c.equals(null); // ==

        // doua instante de obiect care sunt egale trebuie
        // sa aiba acealsi hash code
        // dar daca doua instante au acelasi hash code
        // nu insteamna neaparat ca sunt egale
        c.hashCode();
    }
}
