package exemplu6;

import java.util.List;

public class Card { // card bancar

    private String seria; // patru cifre

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    @Override
    public String toString() {
        return "Card{" +
                "seria='" + seria + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;

        if (o instanceof Card) {
            Card c = (Card) o;

            return c.getSeria().equals(this.getSeria());
        } else {
            return false;
        }
    }


    @Override
    public int hashCode() {
        return List.of(seria.split(""))
                .stream()
                .mapToInt(s -> Integer.parseInt(s))
                .sum();
    }
}
