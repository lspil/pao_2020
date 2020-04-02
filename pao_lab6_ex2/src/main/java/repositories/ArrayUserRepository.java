package repositories;

import model.User;

import java.util.Optional;

public class ArrayUserRepository implements UserRepository {

    private User[] users = new User[10];
    private int n;

    @Override
    public void addUser(User user) {
        users[n] = user;
        n++;
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        for (int i = 0; i<n; i++) {
            if (users[i].getUsername().equals(username)) {
                return Optional.of(users[i]);
            }
        }
        return Optional.empty();
    }
}
