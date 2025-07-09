
public class HotelRoom {
    private String roomNumber;
    private double pricePerNight;
    private int numberOfBeds;

    public HotelRoom() {
        this.roomNumber = "";
        this.pricePerNight = 0.0;
        this.numberOfBeds = 0;
    }

    public HotelRoom(String roomNumber, double pricePerNight, int numberOfBeds) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
        this.numberOfBeds = numberOfBeds;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setNumberOfBeds(int beds) {
        this.numberOfBeds = beds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void displayInfo() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Price Per Night: " + pricePerNight);
        System.out.println("Number of Beds: " + numberOfBeds);
    }

    public double calculateTotalPrice(int days) {
        return pricePerNight * days;
    }
}
