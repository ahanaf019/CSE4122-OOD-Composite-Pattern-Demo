import java.util.ArrayList;

public class Apartment implements IHousingStructure {

    private ArrayList<Room> rooms;
    private String apartmentNumber;

    Apartment(String apartmentNumber) {
        rooms = new ArrayList<Room>();
        this.apartmentNumber = apartmentNumber;
    }

    void addRoom(Room room) {
        rooms.add(room);
    }



    @Override
    public void getStructureDetails() {
        System.out.println("=====================================");
        System.out.println("Apartment Number: " + apartmentNumber);
        System.out.println("Total Rooms: " + rooms.size());

        System.out.println("Room No.\tType");
        for(int i = 0; i < rooms.size(); i++) {
            System.out.println((i+1) + "\t\t" + rooms.get(i).getRoomType());
        }
        System.out.println("=====================================");
        System.out.println();
    }

    @Override
    public int getNoSubUnits() {
        return rooms.size();
    }
    
}
