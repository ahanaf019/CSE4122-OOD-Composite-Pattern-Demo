import java.util.ArrayList;

public class Building implements IHousingStructure {


    private ArrayList<Floor> floors;
    private String buildingNumber;

    Building(String buildingNumber) {
        floors = new ArrayList<Floor>();
        this.buildingNumber = buildingNumber;
    }

    void addFloor(Floor floor) {
        floors.add(floor);
    }


    @Override
    public void getStructureDetails() {
        System.out.println("=====================================");
        System.out.println("Building Number: " + buildingNumber);
        System.out.println("Total Floors: " + floors.size());

        System.out.println("Floor No.\tNo. of Apartments");
        for(int i = 0; i < floors.size(); i++) {
            System.out.println((i+1) + "\t\t" + floors.get(i).getNoApartments());
        }
        System.out.println("=====================================");
        System.out.println();
    }
    
}
