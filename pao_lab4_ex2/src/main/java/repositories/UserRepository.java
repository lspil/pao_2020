package repositories;

import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserRepository {

    public void addUser(User user) {
        try {
            String url = "jdbc:mysql://localhost/pao";
            String username = "root";
            String password = "";

            Connection con =
                    DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO users VALUES (NULL, ?, ?)";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());

            statement.executeUpdate();

            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
