package exemplu4;

public class Exemplu4 {

    public static void main(String[] args) {
        System.out.println(test("val"));
        System.out.println(test("param"));
    }

    public static String test(String param) {
        try {
            if (param.equals("val"))
                throw new Exception();
            else {
                param += "TEST";
                return param;
            }
        } catch (Exception e) {
            return param + 2;
        } finally {
            return param + 3;
        }
    }
}
