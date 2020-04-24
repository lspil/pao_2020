package main;

public class Exemplu19 {

    static class A {
        public static void m(int x) {
            System.out.println("A");
        }

//        public void m(int x, int y) {
//            System.out.println("A");
//        }
    }

    static class B extends A {
        public static void m(int x) {
            System.out.println("B");
        }

        public void m(int x, int y) {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        A a = new B();
        a.m(10); // A.m();
//        a.m(10,20); // ? B
    }
}
