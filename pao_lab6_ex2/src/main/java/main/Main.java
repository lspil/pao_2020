package main;


import model.User;
import service.LoginService;

public class Main {

    public static void main(String[] args) {
        LoginService service = new LoginService();

        User u1 = new User(1, "bill", "12345");

        service.register(u1); // adauga userul
        boolean res1 = service.login(u1); // face login

        System.out.println(res1); // true
    }
}
