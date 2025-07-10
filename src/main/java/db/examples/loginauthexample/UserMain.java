package db.examples.loginauthexample;

public class UserMain {
    public static void main(String[] args) {
        UserService userService = new UserService();
//        User newUser = new User("john_doe2", "securePassword123","j_j@j2.com", "USER", "John", "Doe");

        // Creating a new user
//        userService.addUser(newUser);
        // Attempting to log in with the created user
         User user = userService.loginUser("john_doe21", "securePassword123");
    }
}
