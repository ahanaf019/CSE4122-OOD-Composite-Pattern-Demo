import java.util.ArrayList;

public class Floor implements IHousingStructure {

    private ArrayList<IHousingStructure> apartments;
    private String floorNumber;

    Floor(String floorNumber) {
        apartments = new ArrayList<IHousingStructure>();
        this.floorNumber = floorNumber;
    }

    void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }


    @Override
    public void getStructureDetails() {
        System.out.println("=====================================");
        System.out.println("Floor Number: " + floorNumber);
        System.out.println("Total Apartments: " + apartments.size());
        
        System.out.println("Apartment No.\tNo. of Rooms");
        for(int i = 0; i < apartments.size(); i++) {
            System.out.println((i+1) + "\t\t" + apartments.get(i).getNoSubUnits());
        }
        System.out.println("=====================================");
        System.out.println();
    }

    @Override
    public int getNoSubUnits() {
        return apartments.size();
    }
    
}
