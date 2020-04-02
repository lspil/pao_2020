package repositories;

import model.User;

import java.util.Optional;

public interface UserRepository {

    void addUser(User user);
    Optional<User> findUserByUsername(String username);

    static UserRepository build(Type type) {
        switch (type) {
            case DB: return new DBUserRepository();
            case FILE: return new FileUserRepository();
            case ARRAY:return new ArrayUserRepository();
        }

        throw new RuntimeException("No such type");
    }

    enum Type {
        DB, FILE, ARRAY
    }
}
