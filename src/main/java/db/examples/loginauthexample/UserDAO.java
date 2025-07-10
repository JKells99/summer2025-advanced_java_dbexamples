package db.examples.loginauthexample;

import db.examples.database.DatabaseConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public void addUser(User user) {

        String sql = "INSERT INTO users (username, password, email, role, first_name, last_name) VALUES (?, ?, ?, ?, ?, ?)";
        // Code to execute the SQL statement and add the user to the database
        try (var connection = DatabaseConnection.getConnection();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getRole());
            preparedStatement.setString(5, user.getFirstName());
            preparedStatement.setString(6, user.getLastName());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public User getUserById(int userId) {
        String sql = "SELECT * FROM users WHERE userId = ?";
        try (var connection = DatabaseConnection.getConnection();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, userId);
            var resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return getUser(userId, resultSet);
            }
        } catch (Exception e) {
            e.printStackTrace();
    }
        return null;
    }

    private User getUser(int userId, ResultSet resultSet) throws SQLException {
        String username = resultSet.getString("username");
        String password = resultSet.getString("password");
        String email = resultSet.getString("email");
        String role = resultSet.getString("role");
        String firstName = resultSet.getString("first_name");
        String lastName = resultSet.getString("last_name");
        return new User(userId, username, password, email, role, firstName, lastName);
    }

    public User getUserByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        try (var connection = DatabaseConnection.getConnection();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            var resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int userId = resultSet.getInt("user_id");
                return getUser(userId, resultSet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
