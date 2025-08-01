//import java.util.*;
public class JewelryShowroom extends Showroom{
    private String jewelryMaterial;
    private String [] jewelryItems=new String[10];
    private int itemCount=0;

    private static final String[] authorizedItems= {"Necklaces","Rings","Earrings", "Bracelets", };

    public JewelryShowroom(){

    }
    public JewelryShowroom(String name, String location,double rent, String jewelryMaterial){
        super(name,location,rent);
        this.jewelryMaterial=jewelryMaterial;
    }

    public void setJewelryMaterial(String jewelryMaterial) {

        this.jewelryMaterial = jewelryMaterial;
    }

    public String getJewelryMaterial() {

        return jewelryMaterial;
    }

    public void addItem(String item) throws UnapprovedItemException{
        boolean isAuthorized = false;
        for (String auth : authorizedItems) {
            if (auth.equals(item)) {
                isAuthorized = true;
                break;
            }
        }

        if (!isAuthorized) {
            throw new UnapprovedItemException(item + " is not an approved jewelry item.");

        }
        for (int i = 0; i < itemCount; i++) {
            if (jewelryItems[i]==item) return;
        }
        if (itemCount < jewelryItems.length) {
            jewelryItems[itemCount++] = item;
        }
    }

    public double calculateYearlyRent(){
        return super.calculateYearlyRent()+250*itemCount;
    }

}
