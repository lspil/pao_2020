package exemplu2;

public interface Mail {

    void sendMail();

    public static Mail getMail() {
        return new Yahoo();
    }

    default void m() {

    }
}
