package repositories;

import model.User;

import java.util.Optional;

public class UserRepository {

    private User[] users = new User[10];

    private UserRepository() {
        this.users[0] = new User("gigel","12345");
        this.users[1] = new User("dorel", "abcde");
        this.users[2] = new User("nicu","qwerty");
    }

    public Optional<User> findUserByUsername(String username) {
        for (User u : users) {
            if (u != null) {
                if (username.equals(u.getUsername())) {
                    return Optional.of(u);
                }
            }
        }

        return Optional.empty();
    }

    public static UserRepository getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static UserRepository INSTANCE = new UserRepository();
    }
}
