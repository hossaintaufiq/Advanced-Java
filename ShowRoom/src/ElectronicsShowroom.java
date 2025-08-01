import java.util.*;
public class ElectronicsShowroom extends Showroom{
    private String electronicsBrand;
    private String[] electronicsItems = new String[10];
    private int itemCount = 0;
    private static final String[] authorizedItems = {
            "Television", "Refrigerator", "Microwave Oven", "Rice Cooker", "Toaster"
    };
    public ElectronicsShowroom(){

    }
    public ElectronicsShowroom(String name, String location, double rent, String brand) {
        super(name, location, rent);
        this.electronicsBrand = brand;
    }

    public String getElectronicsBrand() {
        return electronicsBrand;
    }

    public void setElectronicsBrand(String electronicsBrand) {
        this.electronicsBrand = electronicsBrand;
    }
    public void addItem(String item) throws UnapprovedItemException {
        if (!Arrays.asList(authorizedItems).contains(item)) {
            throw new UnapprovedItemException(item + " is not an approved electronics item.");
        }
        for (int i = 0; i < itemCount; i++) {
            if (electronicsItems[i].equals(item)) return;
        }
        if (itemCount < electronicsItems.length) {
            electronicsItems[itemCount++] = item;
        }
    }


    public double calculateYearlyRent() {
        return super.calculateYearlyRent() + 750 * itemCount;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Electronics Brand: " + electronicsBrand);
        System.out.print("Electronics Items: ");
        for (int i = 0; i < itemCount; i++) {
            System.out.print(electronicsItems[i]);
            if (i != itemCount - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
