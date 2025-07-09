
public class Main {
    public static void main(String[] args) {
        HotelRoom room1 = new HotelRoom("H101", 2000, 2);
        room1.displayInfo();
        System.out.println("Total Price for 3 days: " + room1.calculateTotalPrice(3));
        System.out.println();

        RegularHotelRoom regRoom1 = new RegularHotelRoom("R202", 2500, 3, true, true);
        regRoom1.displayInfo();
        System.out.println("Total Price for 2 days: " + regRoom1.calculateTotalPrice(2));
        System.out.println();

        RegularHotelRoom regRoom2 = new RegularHotelRoom("R203", 1800, 1, true, false);
        regRoom2.displayInfo();
        System.out.println("Total Price for 2 days: " + regRoom2.calculateTotalPrice(2));
        System.out.println();

        RegularHotelRoom regRoom3 = new RegularHotelRoom("R204", 1800, 1, false, true);
        regRoom3.displayInfo();
        System.out.println("Total Price for 2 days: " + regRoom3.calculateTotalPrice(2));
        System.out.println();

        RegularHotelRoom regRoom4 = new RegularHotelRoom("R205", 1800, 1, false, false);
        regRoom4.displayInfo();
        System.out.println("Total Price for 2 days: " + regRoom4.calculateTotalPrice(2));
    }
}
