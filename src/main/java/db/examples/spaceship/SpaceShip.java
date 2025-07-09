package db.examples.spaceship;

public class SpaceShip {
    private int spaceShipId;
    private String spaceShipName;
    private String spaceShipType;
    private String spaceShipDescription;
    private String spaceShipLocation;

    public SpaceShip(int spaceShipId, String spaceShipName, String spaceShipType, String spaceShipDescription, String spaceShipLocation) {
        this.spaceShipId = spaceShipId;
        this.spaceShipName = spaceShipName;
        this.spaceShipType = spaceShipType;
        this.spaceShipDescription = spaceShipDescription;
        this.spaceShipLocation = spaceShipLocation;
    }

    public SpaceShip(String spaceShipName, String spaceShipType, String spaceShipDescription, String spaceShipLocation) {
        this.spaceShipName = spaceShipName;
        this.spaceShipType = spaceShipType;
        this.spaceShipDescription = spaceShipDescription;
        this.spaceShipLocation = spaceShipLocation;
    }

    public int getSpaceShipId() {
        return spaceShipId;
    }

    public void setSpaceShipId(int spaceShipId) {
        this.spaceShipId = spaceShipId;
    }

    public String getSpaceShipName() {
        return spaceShipName;
    }

    public void setSpaceShipName(String spaceShipName) {
        this.spaceShipName = spaceShipName;
    }

    public String getSpaceShipType() {
        return spaceShipType;
    }

    public void setSpaceShipType(String spaceShipType) {
        this.spaceShipType = spaceShipType;
    }

    public String getSpaceShipDescription() {
        return spaceShipDescription;
    }

    public void setSpaceShipDescription(String spaceShipDescription) {
        this.spaceShipDescription = spaceShipDescription;
    }

    public String getSpaceShipLocation() {
        return spaceShipLocation;
    }

    public void setSpaceShipLocation(String spaceShipLocation) {
        this.spaceShipLocation = spaceShipLocation;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "spaceShipId=" + spaceShipId +
                ", spaceShipName='" + spaceShipName + '\'' +
                ", spaceShipType='" + spaceShipType + '\'' +
                ", spaceShipDescription='" + spaceShipDescription + '\'' +
                ", spaceShipLocation='" + spaceShipLocation + '\'' +
                '}';
    }
}
