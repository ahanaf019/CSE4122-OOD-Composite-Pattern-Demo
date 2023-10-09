public class Main {
    
    public static void main(String[] args) {
        Room masterBedRoom = new Room("Master Bedroom");
        Room secondaryBedRoom = new Room("Secondary BedRoom");
        Room guestBedRoom = new Room("Guest BedRoom");

        Room kitchen = new Room("Kitchen");
        Room drawingRoom = new Room("Drawing Room");
        Room diningRoom = new Room("Dining Room");
        Room storageRoom = new Room("Storage Room");


        Apartment apartment1 = new Apartment("1-a");
        Apartment apartment2 = new Apartment("1-b");
        Apartment apartment3 = new Apartment("2-a");
        Apartment apartment4 = new Apartment("2-b");

        Floor floor1 = new Floor("1");
        Floor floor2 = new Floor("2");

        Building building = new Building("B-387/4");

        apartment1.addRoom(masterBedRoom);
        apartment1.addRoom(guestBedRoom);
        apartment1.addRoom(diningRoom);
        apartment1.addRoom(drawingRoom);
        apartment1.addRoom(kitchen);
        apartment1.addRoom(storageRoom);

        apartment2.addRoom(masterBedRoom);
        apartment2.addRoom(secondaryBedRoom);
        apartment2.addRoom(diningRoom);
        apartment2.addRoom(drawingRoom);
        apartment2.addRoom(kitchen);

        apartment3.addRoom(masterBedRoom);
        apartment3.addRoom(diningRoom);
        apartment3.addRoom(kitchen);

        apartment4.addRoom(masterBedRoom);
        apartment4.addRoom(guestBedRoom);
        apartment4.addRoom(guestBedRoom);
        apartment4.addRoom(diningRoom);
        apartment4.addRoom(drawingRoom);
        apartment4.addRoom(kitchen);


        floor1.addApartment(apartment1);
        floor1.addApartment(apartment2);
        
        floor2.addApartment(apartment3);
        floor2.addApartment(apartment4);

        building.addFloor(floor1);
        building.addFloor(floor2);


        // Print details
        building.getStructureDetails();

        floor1.getStructureDetails();
        floor2.getStructureDetails();

        apartment1.getStructureDetails();
        apartment2.getStructureDetails();
        apartment3.getStructureDetails();
        apartment4.getStructureDetails();
    }
}
