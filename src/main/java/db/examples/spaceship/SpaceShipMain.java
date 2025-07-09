package db.examples.spaceship;

public class SpaceShipMain {
    public static void main(String[] args) {
        SpaceShipService spaceShipService = new SpaceShipService();
        SpaceShip newSpaceShip = new SpaceShip("Galactic Cruiser", "Exploration", "A ship designed for deep space exploration", "Sector 7G");


        spaceShipService.getAllSpaceShips();


    }
}
