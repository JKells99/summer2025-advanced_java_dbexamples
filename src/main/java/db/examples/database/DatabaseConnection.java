package db.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // You only need to change the name of the database in the URL, unless PG runs on another port on your system
    private static final String URL = "jdbc:postgresql://localhost:5433/s3summer2025example";
    //    By default the username is postgres and the password is what ever you set it to be. I usually keep mine simple
    private static final String USER = "postgres";
    private static final String PASSWORD = "jordan1234";

    public static Connection getConnection() throws SQLException, SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }


    // this is just a simple main method to test the connection
    public static void main(String[] args) {
        try {
            DatabaseConnection.getConnection();
            System.out.println("Connection successful");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
