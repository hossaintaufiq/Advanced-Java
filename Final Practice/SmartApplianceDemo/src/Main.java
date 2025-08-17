//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create WasherDryer object
        WasherDryer myAppliance = new WasherDryer("LG Smart WasherDryer");

        // Show appliance details
        myAppliance.showApplianceDetails();

        // Demonstrate washing and drying
        myAppliance.startWashing();
        myAppliance.startDrying();
    }
}