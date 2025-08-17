// Abstract class Appliance
abstract class Appliance {
    protected String applianceName;

    public Appliance(String applianceName) {
        this.applianceName = applianceName;
    }

    public abstract void showApplianceDetails();
}