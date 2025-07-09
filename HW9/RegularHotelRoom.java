
public class RegularHotelRoom extends HotelRoom {
    private boolean hasWiFi;
    private boolean hasAC;

    public RegularHotelRoom() {
        super();
        this.hasWiFi = false;
        this.hasAC = false;
    }

    public RegularHotelRoom(String roomNumber, double pricePerNight, int numberOfBeds, boolean hasWiFi, boolean hasAC) {
        super(roomNumber, pricePerNight, numberOfBeds);
        this.hasWiFi = hasWiFi;
        this.hasAC = hasAC;
    }

    public boolean getHasWiFi() {
        return hasWiFi;
    }

    public boolean getHasAC() {
        return hasAC;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("WiFi: " + (hasWiFi ? "Yes" : "No"));
        System.out.println("AC: " + (hasAC ? "Yes" : "No"));
    }

    public double calculateTotalPrice(int days) {
        double extraCharge = 0;
        if (hasWiFi && hasAC) {
            extraCharge = 1000;
        } else if (hasWiFi) {
            extraCharge = 300;
        } else if (hasAC) {
            extraCharge = 700;
        }
        return (getPricePerNight() + extraCharge) * days;
    }
}
