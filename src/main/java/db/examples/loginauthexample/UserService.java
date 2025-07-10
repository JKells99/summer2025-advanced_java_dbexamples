package db.examples.loginauthexample;


import org.mindrot.jbcrypt.BCrypt;

public class UserService {

    private static UserDAO userDAO = new UserDAO();

    public void addUser(User user) {
        // Check if user already exists
        User existingUser = userDAO.getUserByUsername(user.getUsername());
        if (existingUser != null) {
            throw new IllegalArgumentException("User with this username already exists.");
        }
        String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashedPassword);
        userDAO.addUser(user);
        System.out.println("Creating new user: " + user.getUsername());
    }

    public User loginUser(String username, String password) {
        User user = userDAO.getUserByUsername(username);
        if (user == null) {
            throw new IllegalArgumentException("User not found.");
        }
        if (!BCrypt.checkpw(password, user.getPassword())) {
            throw new IllegalArgumentException("Invalid Creds Try Again.");
        }

        System.out.println("Welcome " + user.getUsername() + "! You have successfully logged in.");

        return user;


    }

    public User getUserById(int userId) {
        return userDAO.getUserById(userId);
    }

    public User getUserByUsername(String username) {
        return userDAO.getUserByUsername(username);
    }
}
