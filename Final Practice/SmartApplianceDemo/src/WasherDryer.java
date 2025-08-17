// Concrete class WasherDryer
class WasherDryer extends Appliance implements Washable, Dryable {

    public WasherDryer(String applianceName) {
        super(applianceName);
    }

    @Override
    public void showApplianceDetails() {
        System.out.println("Appliance Name: " + applianceName);
        System.out.println("Type: Washer & Dryer Combo");
    }

    @Override
    public void startWashing() {
        System.out.println(applianceName + " has started washing clothes...");
    }

    @Override
    public void startDrying() {
        System.out.println(applianceName + " has started drying clothes...");
    }
}