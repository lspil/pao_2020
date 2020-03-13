package service;

import model.User;
import repositories.UserRepository;

import java.util.Optional;

public class LoginService {

    private LoginService() {

    }

    public boolean login(User user) {
        UserRepository userRepository = UserRepository.getInstance();
        Optional<User> u = userRepository.findUserByUsername(user.getUsername());

        if(u.isPresent()) {
            User usr = u.get();
            if (usr.getPassword().equals(user.getPassword())) {
                return true;
            }
        }

        return false;
    }

    public static LoginService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static LoginService INSTANCE = new LoginService();
    }
}
