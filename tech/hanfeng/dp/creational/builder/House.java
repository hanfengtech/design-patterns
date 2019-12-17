package tech.hanfeng.dp.creational.builder;

public class House {
    private String floorType;
    private String wallType;
    private String roofType;

    public String getFloorType() {
        return floorType;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    public String getWallType() {
        return wallType;
    }

    public void setWallType(String wallType) {
        this.wallType = wallType;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public String toString() {
        return new String("\nConstructing House \n FloorType: " + floorType + 
        "\n WallType: " + wallType + "\n RoofType: " + roofType);
    }
}