import java.util.ArrayList;

public class Building implements IHousingStructure {


    private ArrayList<IHousingStructure> floors;
    private String buildingNumber;

    Building(String buildingNumber) {
        floors = new ArrayList<IHousingStructure>();
        this.buildingNumber = buildingNumber;
    }

    void addFloor(IHousingStructure floor) {
        floors.add(floor);
    }


    @Override
    public void getStructureDetails() {
        System.out.println("=====================================");
        System.out.println("Building Number: " + buildingNumber);
        System.out.println("Total Floors: " + floors.size());

        System.out.println("Floor No.\tNo. of Apartments");
        for(int i = 0; i < floors.size(); i++) {
            System.out.println((i+1) + "\t\t" + floors.get(i).getNoSubUnits());
        }
        System.out.println("=====================================");
        System.out.println();
    }


    @Override
    public int getNoSubUnits() {
        return floors.size();
    }
    
}
