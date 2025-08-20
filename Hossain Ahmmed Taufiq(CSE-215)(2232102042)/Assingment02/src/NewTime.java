import java.util.Calendar;
import java.util.GregorianCalendar;

// NewTime class
// Stores and manages time (hour, minute, second)
public class NewTime implements Cloneable, Comparable<NewTime> {

    // fields (variables)
    private int hour;
    private int minute;
    private int second;

    // ---------------- Constructors ----------------

    // 1. Default constructor (system time)
    public NewTime() {
        Calendar now = new GregorianCalendar();
        this.hour = now.get(Calendar.HOUR_OF_DAY);
        this.minute = now.get(Calendar.MINUTE);
        this.second = now.get(Calendar.SECOND);
    }

    // 2. Constructor with String input (like "12:30:45" or "23-59-59")
    public NewTime(String timeText) {
        try {
            String[] parts = timeText.split("[:\\-/]"); // split by : or - or /
            if (parts.length != 3) throw new IllegalArgumentException("Wrong format!");

            int h = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int s = Integer.parseInt(parts[2]);

            if (!isValid(h, m, s)) throw new IllegalArgumentException("Invalid time!");

            this.hour = h;
            this.minute = m;
            this.second = s;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            // fallback → set to system time
            Calendar now = new GregorianCalendar();
            this.hour = now.get(Calendar.HOUR_OF_DAY);
            this.minute = now.get(Calendar.MINUTE);
            this.second = now.get(Calendar.SECOND);
        }
    }

    // 3. Constructor with Calendar input
    public NewTime(Calendar c) {
        this.hour = c.get(Calendar.HOUR_OF_DAY);
        this.minute = c.get(Calendar.MINUTE);
        this.second = c.get(Calendar.SECOND);
    }

    // ---------------- Helper Method ----------------
    private boolean isValid(int h, int m, int s) {
        return (h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60);
    }

    // ---------------- Setters ----------------
    public boolean setTime(int h, int m, int s) {
        if (!isValid(h, m, s)) return false;
        this.hour = h;
        this.minute = m;
        this.second = s;
        return true;
    }

    // ---------------- Getters ----------------
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    // ---------------- Difference ----------------
    public long difference(NewTime other) {
        // convert both times into total seconds
        long thisTotal = this.hour * 3600 + this.minute * 60 + this.second;
        long otherTotal = other.hour * 3600 + other.minute * 60 + other.second;
        return Math.abs(thisTotal - otherTotal);
    }

    // ---------------- CompareTo ----------------
    @Override
    public int compareTo(NewTime other) {
        long thisTotal = this.hour * 3600 + this.minute * 60 + this.second;
        long otherTotal = other.hour * 3600 + other.minute * 60 + other.second;
        return Long.compare(thisTotal, otherTotal);
    }

    // ---------------- Clone ----------------
    @Override
    public NewTime clone() {
        return new NewTime(String.format("%02d:%02d:%02d", hour, minute, second));
    }

    // ---------------- ToString ----------------
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
