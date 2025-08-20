import java.util.Calendar;
import java.util.GregorianCalendar;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("===== CSE215 Assignment 2: NewTime Program =====\n");

        // Step 1: Create 3 objects with different constructors
        System.out.println("Step 1: Creating NewTime objects");
        NewTime x = new NewTime(); // system time
        System.out.println("Object x created with system time: " + x);

        NewTime y = new NewTime("12:30:45"); // from string
        System.out.println("Object y created from string (12:30:45): " + y);

        Calendar c = new GregorianCalendar(2025, Calendar.AUGUST, 20, 23, 59, 59);
        NewTime z = new NewTime(c); // from calendar
        System.out.println("Object z created from calendar (20 Aug 2025, 23:59:59): " + z);

        // Step 2: Using setTime()
        System.out.println("\nStep 2: Using setTime() on y");
        boolean ok1 = y.setTime(15, 45, 30); // valid input
        System.out.println("Trying to set y = 15:45:30 → result: " + ok1);
        System.out.println("Current value of y: " + y);

        boolean ok2 = y.setTime(25, 70, 90); // invalid input
        System.out.println("Trying to set y = 25:70:90 → result: " + ok2);
        System.out.println("Current value of y (unchanged if invalid): " + y);

        // Step 3: Finding difference
        System.out.println("\nStep 3: Finding difference between x and y");
        long diff = x.difference(y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Difference between x and y: " + diff + " seconds");

        // Step 4: Comparing objects
        System.out.println("\nStep 4: Comparing x and y using compareTo()");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int cmp = x.compareTo(y);
        if (cmp == 0) {
            System.out.println("x and y are the SAME time.");
        } else if (cmp < 0) {
            System.out.println("x is EARLIER than y.");
        } else {
            System.out.println("x is LATER than y.");
        }

        // Step 5: Cloning
        System.out.println("\nStep 5: Cloning object y");
        NewTime copy = y.clone();
        System.out.println("Original y: " + y);
        System.out.println("Clone of y: " + copy);

        // Step 6: Using toString()
        System.out.println("\nStep 6: Printing object z with toString()");
        System.out.println("z as string: " + z);

        System.out.println("\n===== Program Finished =====");
    }
}