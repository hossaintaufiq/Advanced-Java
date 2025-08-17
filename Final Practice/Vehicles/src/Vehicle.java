// Abstract class Vehicle
abstract class Vehicle {
    String vehicleName;

    // Constructor
    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    // Abstract method
    abstract void displayDetails();
}
