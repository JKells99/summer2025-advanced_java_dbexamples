package db.examples.spaceship;

/**
 * Service class for managing SpaceShip operations.
 * Acts as an intermediary between the controller and the DAO layer.
 */
public class SpaceShipService {
    private SpaceShipDAO spaceShipDAO;

    /**
     * Constructs a new SpaceShipService and initializes the DAO.
     */
    public SpaceShipService() {
        this.spaceShipDAO = new SpaceShipDAO();
    }

    /**
     * Adds a new SpaceShip to the database.
     *
     * @param spaceShip the SpaceShip object to be added
     */
    public void addSpaceShip(SpaceShip spaceShip) {
        System.out.println("Adding spaceship: " + spaceShip.getSpaceShipName());
        spaceShipDAO.addSpaceShip(spaceShip);
    }

    /**
     * Retrieves and prints all SpaceShips from the database.
     */
    public void getAllSpaceShips() {
        System.out.println("Retrieving all spaceships:");
        spaceShipDAO.getAllSpaceShips();
    }

    // Additional methods for retrieving, updating, and deleting spaceships can be added here
}