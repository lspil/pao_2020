package exemplu6;

public class Exemplu7 {

    public static void main(String[] args) {
        Card c1 = new Card();
        c1.setSeria("1234");

        Card c2 = new Card();
        c2.setSeria("1234");

        System.out.println(c1.equals(c2)); // true

//        String s1 = new String("abcd");
//        String s2 = new String("abcd");
//
//        System.out.println(s1.equals(s2)); // true
    }
}
