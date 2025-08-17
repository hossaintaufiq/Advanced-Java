// HybridCar extends Vehicle and implements both FuelPowered and ElectricPowered
public class HybridCar extends Vehicle implements FuelPowered, ElectricPowered {

    public HybridCar(String name) {
        super(name);
    }

    // Implement abstract method
    @Override
    void displayDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Type: Hybrid Car (Fuel + Electric)");
    }

    // Implement refuel from FuelPowered
    @Override
    public void refuel() {
        System.out.println(vehicleName + " is refueling with petrol...");
    }

    // Implement recharge from ElectricPowered
    @Override
    public void recharge() {
        System.out.println(vehicleName + " is recharging its battery...");
    }
}
