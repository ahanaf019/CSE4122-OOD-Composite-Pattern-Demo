public class Room implements IHousingStructure {

    private String roomType;

    Room(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }

    @Override
    public void getStructureDetails() {
        System.out.println("Room: " + roomType);
    }


    @Override
    public int getNoSubUnits() {
        System.out.println("ERROR: Room has no subunits");
        return 0;
    }
    
}
