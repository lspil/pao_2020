package exemplu1;

public class IFactory {

    public static I getI() {
        return new B();
    }
}
