//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle Motorcycle = new Motorcycle();

        car.start();
        Motorcycle.start();

        car.stop();
        Motorcycle.stop();
    }
}