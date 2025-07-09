package db.examples.product;

import db.examples.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {

    // write me a sql script in PG to make this table
    // CREATE TABLE products (
    //     product_id SERIAL PRIMARY KEY,
    //     product_name VARCHAR(255) NOT NULL,
    //     product_type VARCHAR(100) NOT NULL,
    //     product_description TEXT,
    //     product_location VARCHAR(255) NOT NULL
    // );

    public void createNewProduct(Product product) {
        String sql = "INSERT INTO products (product_name, product_type, product_description, product_location) VALUES (?, ?, ?, ?)";
        // Code to execute the SQL statement using a database connection
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, product.getProductName());
            preparedStatement.setString(2, product.getProductType());
            preparedStatement.setString(3, product.getProductDescription());
            preparedStatement.setString(4, product.getProductLocation());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getAllProductsFromDatabase() {
        String sql = "SELECT * FROM products";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            var resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("product_id");
                String name = resultSet.getString("product_name");
                String type = resultSet.getString("product_type");
                String description = resultSet.getString("product_description");
                String location = resultSet.getString("product_location");
                System.out.println("ID: " + id + ", Name: " + name + ", Type: " + type +
                        ", Description: " + description + ", Location: " + location);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
