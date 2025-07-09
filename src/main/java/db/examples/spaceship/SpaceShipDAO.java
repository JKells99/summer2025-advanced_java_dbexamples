package db.examples.spaceship;

import db.examples.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Data Access Object (DAO) for performing CRUD operations on the SpaceShip table.
 * Provides methods to add a new spaceship and retrieve all spaceships from the database.
 */
public class SpaceShipDAO {

    /**
     * Inserts a new SpaceShip record into the database.
     *
     * @param spaceShip the SpaceShip object containing the data to be inserted
     */
    public void addSpaceShip(SpaceShip spaceShip) {
        String sql = "INSERT INTO SpaceShip (spaceShipName, spaceShipType, spaceShipDescription, spaceShipLocation) VALUES (?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, spaceShip.getSpaceShipName());
            preparedStatement.setString(2, spaceShip.getSpaceShipType());
            preparedStatement.setString(3, spaceShip.getSpaceShipDescription());
            preparedStatement.setString(4, spaceShip.getSpaceShipLocation());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Retrieves and prints all SpaceShip records from the database.
     * Outputs the details of each spaceship to the console.
     */
    public void getAllSpaceShips() {
        String sql = "SELECT * FROM SpaceShip";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            var resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("spaceShipId");
                String name = resultSet.getString("spaceShipName");
                String type = resultSet.getString("spaceShipType");
                String description = resultSet.getString("spaceShipDescription");
                String location = resultSet.getString("spaceShipLocation");
                System.out.println("ID: " + id + ", Name: " + name + ", Type: " + type +
                        ", Description: " + description + ", Location: " + location);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}