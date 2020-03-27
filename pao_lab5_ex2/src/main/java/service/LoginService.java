package service;

import model.User;
import repositories.UserRepository;

public class LoginService {

    private UserRepository userRepository;

    public LoginService() {
        userRepository = new UserRepository();
    }

    public boolean login(User user) {
        User result = userRepository.findUserByUsername(user.getUsername());

        if (result != null) {
            if (result.getPassword().equals(user.getPassword())) {
                return true;
            }
        }

        return false;
    }
}
