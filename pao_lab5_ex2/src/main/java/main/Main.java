package main;


import model.User;
import service.LoginService;

public class Main {

    public static void main(String[] args) {
        LoginService service = new LoginService();

        User u1 = new User(0, "bill", "12345");
        boolean res1 = service.login(u1);

        User u2 = new User(0, "jane", "12345");
        boolean res2 = service.login(u2);

        User u3 = new User(0, "bill", "55555");
        boolean res3 = service.login(u3);

        System.out.println(res1); // true
        System.out.println(res2); // false
        System.out.println(res3); // false
    }
}
