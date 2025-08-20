import java.util.Calendar;
import java.util.GregorianCalendar;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Object x: current system time
        NewTime x = new NewTime();
        System.out.println("x (system time): " + x);

        // Object y: from string (valid)
        NewTime y = new NewTime("12:30:45");
        System.out.println("y (from string): " + y);

        // Object z: from Calendar
        Calendar gc = new GregorianCalendar(2025, Calendar.AUGUST, 20, 23, 59, 59);
        NewTime z = new NewTime(gc);
        System.out.println("z (from calendar): " + z);

        // setTime() demo (valid and invalid)
        System.out.println("\n--- setTime() demo ---");
        boolean set1 = y.setTime(15, 45, 30);
        System.out.println("Setting y to 15:45:30 → " + set1 + " → " + y);

        boolean set2 = y.setTime(25, 70, 90); // invalid
        System.out.println("Setting y to 25:70:90 → " + set2 + " → " + y);

        // difference()
        System.out.println("\n--- difference() demo ---");
        long diff = x.difference(y);
        System.out.println("Difference between x and y = " + diff + " seconds");

        // compareTo()
        System.out.println("\n--- compareTo() demo ---");
        System.out.println("x.compareTo(y) = " + x.compareTo(y));

        // clone()
        System.out.println("\n--- clone() demo ---");
        NewTime cloneY = y.clone();
        System.out.println("Clone of y = " + cloneY);

        // toString()
        System.out.println("\n--- toString() demo ---");
        System.out.println("z as string = " + z);
    }
}