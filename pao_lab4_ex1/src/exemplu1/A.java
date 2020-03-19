package exemplu1;

public class A {

    private I b = IFactory.getI();

    public void a() {
        b.b();
    }
}
