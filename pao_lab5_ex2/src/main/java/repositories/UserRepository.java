package repositories;

import managers.DBConnectionManager;
import model.User;

import java.sql.*;

public class UserRepository {

    public void addUser(User user) {
        String sql = "INSERT INTO users VALUES (NULL, ?, ?)";

        try (
           Connection con = DBConnectionManager.getInstance().createConnection();
           PreparedStatement statement = con.prepareStatement(sql);
        ) {
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User findUserByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";

        try (
            Connection con = DBConnectionManager.getInstance().createConnection();
            PreparedStatement statement = con.prepareStatement(sql);
        ) {
            statement.setString(1, username);

            ResultSet set = statement.executeQuery(); // in RS avem randurile din tabela

            if (set.next()) {
                int id = set.getInt("id");
                String u = set.getString("username");
                String p = set.getString("password");

                return new User(id, u, p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
