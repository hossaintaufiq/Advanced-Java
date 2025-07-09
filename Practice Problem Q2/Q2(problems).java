Java Class Implementations Based on UML Diagrams


// 1. WeatherMonitoringSystem


public class WeatherMonitoringSystem {
 private double[] temperatures = new double[7];
 private String[] days = new String[7];
 private int count = 0;
 public void addTemperature(String day, double temperature) {
 if (count < 7) {
 days[count] = day;
 temperatures[count] = temperature;
 count++;
 } else {
 System.out.println("Maximum entries reached.");
 }
 }
 public double calculateAverageTemperature() {
 double sum = 0;
 for (int i = 0; i < count; i++) {
 sum += temperatures[i];
 }
 return (count == 0) ? 0 : sum / count;
 }
 public double getMaxTemperature() {
 if (count == 0) return 0;
 double max = temperatures[0];
 for (int i = 1; i < count; i++) {
 if (temperatures[i] > max) max = temperatures[i];
 }
 return max;
 }
 public double getMinTemperature() {
 if (count == 0) return 0;
 double min = temperatures[0];
 for (int i = 1; i < count; i++) {
 if (temperatures[i] < min) min = temperatures[i];
 }
 return min;
 }
 public void displayTemperatures() {
 for (int i = 0; i < count; i++) {
 System.out.println(days[i] + ": " + temperatures[i] + "°C");
 }
 }
}




// 2. AirlineReservationSystem


public class AirlineReservationSystem {
 private String[] seatClass = {"Economy", "Business", "First"};
 private double[] seatPrice = {5000, 10000, 15000};
 private int[] seatsAvailable = {10, 5, 2};
 public boolean bookSeat(int classIndex) {
 if (classIndex >= 0 && classIndex < seatsAvailable.length &&
seatsAvailable[classIndex] > 0) {
 seatsAvailable[classIndex]--;
 return true;
 }
 return false;
 }
 public void cancelSeat(int classIndex) {
 if (classIndex >= 0 && classIndex < seatsAvailable.length) {
 seatsAvailable[classIndex]++;
 }
 }
 public double calculateFare(int classIndex, int numSeats) {
 if (classIndex >= 0 && classIndex < seatPrice.length) {
 return seatPrice[classIndex] * numSeats;
 }
 return 0;
 }
 public void displayAvailableSeats() {
 for (int i = 0; i < seatClass.length; i++) {
 System.out.println(seatClass[i] + ": " + seatsAvailable[i] + " seats");
 }
 }
}




// 3. OnlineFoodDeliverySystem


public class OnlineFoodDeliverySystem {
 private int orderId;
 private String[] foodItems = new String[10];
 private String status;
 private double totalCost = 0;
 private int count = 0;
 public void addFoodItem(String item, double cost) {
 if (count < foodItems.length) {
 foodItems[count++] = item;
 totalCost += cost;
 }
 }
 public void updateStatus(String newStatus) {
 status = newStatus;
 }
 public double calculateTotal() {
 return totalCost;
 }
 public String getOrderDetails() {
 StringBuilder details = new StringBuilder("Order ID: " + orderId +
"\nItems:\n");
 for (int i = 0; i < count; i++) {
 details.append(foodItems[i]).append("\n");
 }
 details.append("Total: ").append(totalCost).append("\nStatus: ").append(status);
 return details.toString();
 }
}





// 4. BankingSystem

public class BankingSystem {
 private String[] accountNumbers = new String[10];
 private double[] balances = new double[10];
 private int totalAccounts = 0;
 public void createAccount(String accountNumber, double initialBalance) {
 if (totalAccounts < 10) {
 accountNumbers[totalAccounts] = accountNumber;
 balances[totalAccounts] = initialBalance;
 totalAccounts++;
 }
 }
 public void deposit(String accountNumber, double amount) {
 for (int i = 0; i < totalAccounts; i++) {
 if (accountNumbers[i].equals(accountNumber)) {
 balances[i] += amount;
 break;
 }
 }
 }
 public void withdraw(String accountNumber, double amount) {
 for (int i = 0; i < totalAccounts; i++) {
 if (accountNumbers[i].equals(accountNumber) && balances[i] >= amount) {
 balances[i] -= amount;
 break;
 }
 }
 }
 public void displayAccountDetails() {
 for (int i = 0; i < totalAccounts; i++) {
 System.out.println("Account: " + accountNumbers[i] + ", Balance: " +
balances[i]);
 }
 }
}




// 5. InventoryManagement


public class InventoryManagement {
 private String[] productNames = new String[10];
 private int[] stockQuantities = new int[10];
 private double[] prices = new double[10];
 private int totalProducts = 0;
 public void addProduct(String name, double price, int quantity) {
 if (totalProducts < 10) {
 productNames[totalProducts] = name;
 prices[totalProducts] = price;
 stockQuantities[totalProducts] = quantity;
 totalProducts++;
 }
 }
 public void updateStock(String name, int quantity) {
 for (int i = 0; i < totalProducts; i++) {
 if (productNames[i].equals(name)) {
 stockQuantities[i] += quantity;
 break;
 }
 }
 }
 public double calculateTotalValue() {
 double total = 0;
 for (int i = 0; i < totalProducts; i++) {
 total += prices[i] * stockQuantities[i];
 }
 return total;
 }
 public void displayInventory() {
 for (int i = 0; i < totalProducts; i++) {
 System.out.println(productNames[i] + ": " + stockQuantities[i] + " units, $"
+ prices[i] + " each");
 }
 }
}