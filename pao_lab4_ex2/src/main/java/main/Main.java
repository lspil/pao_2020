package main;

import model.User;
import repositories.UserRepository;

public class Main {

    public static void main(String[] args) {
        UserRepository repository = new UserRepository();

        User user = new User();
        user.setUsername("bill");
        user.setPassword("12345");

        repository.addUser(user);
    }
}
