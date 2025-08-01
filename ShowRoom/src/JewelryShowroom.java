public class JewelryShowroom extends Showroom{
    private String jewelryMaterial;
    private String [] jewelryItems=new String[10];
    private int itemCount=0;

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

}
