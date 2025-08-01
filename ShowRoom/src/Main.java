public class Main {
    public static void main(String[] args) {
        try {
            JewelryShowroom jewelry = new JewelryShowroom("Golden Gems", "Dhaka", 2000, "Gold");
            jewelry.addItem("Rings");
            jewelry.addItem("Bracelets");
            jewelry.addItem("Necklaces");
            jewelry.displayInfo();

            System.out.println("\n--------------------------\n");

            ElectronicsShowroom electronics = new ElectronicsShowroom("ElectroMart", "Chittagong", 3000, "Samsung");
            electronics.addItem("Television");
            electronics.addItem("Rice Cooker");
            electronics.addItem("Microwave Oven");
            electronics.displayInfo();

            System.out.println("\n--------------------------\n");

            AutomobileShowroom autos = new AutomobileShowroom("SpeedCars", "Sylhet", 5000, "Toyota");
            autos.addModel("2024 Camry");
            autos.addModel("2024 Corolla");
            autos.addModel("2023 GR86");
            autos.displayInfo();

        } catch (UnapprovedItemException | UnauthorizedModelException e) {
            System.out.println(e.getMessage());
        }
    }
}