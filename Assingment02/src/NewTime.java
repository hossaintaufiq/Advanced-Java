import java.util.Calendar;
import java.util.GregorianCalendar;

public class NewTime implements Cloneable, Comparable<NewTime> {
    private int hour;
    private int minute;
    private int second;

    // ---------------- Constructors ----------------
    // 1. Default constructor: current system time
    public NewTime() {
        Calendar gc = new GregorianCalendar();
        this.hour = gc.get(Calendar.HOUR_OF_DAY);
        this.minute = gc.get(Calendar.MINUTE);
        this.second = gc.get(Calendar.SECOND);
    }

    // 2. String input constructor: format like "12:30:45" or "23-59-59"
    public NewTime(String timeString) {
        try {
            String[] parts = timeString.split("[:\\-/]");
            if (parts.length != 3) throw new IllegalArgumentException("Invalid format");

            int h = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int s = Integer.parseInt(parts[2]);

            if (!isValidTime(h, m, s)) throw new IllegalArgumentException("Invalid values");

            this.hour = h;
            this.minute = m;
            this.second = s;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            // fallback to system time if invalid
            Calendar gc = new GregorianCalendar();
            this.hour = gc.get(Calendar.HOUR_OF_DAY);
            this.minute = gc.get(Calendar.MINUTE);
            this.second = gc.get(Calendar.SECOND);
        }
    }

    // 3. Calendar constructor
    public NewTime(Calendar gc) {
        this.hour = gc.get(Calendar.HOUR_OF_DAY);
        this.minute = gc.get(Calendar.MINUTE);
        this.second = gc.get(Calendar.SECOND);
    }

    // ---------------- Validation ----------------
    private boolean isValidTime(int h, int m, int s) {
        return (h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60);
    }

    // ---------------- Setters ----------------
    public boolean setTime(int h, int m, int s) {
        if (!isValidTime(h, m, s)) return false;
        this.hour = h;
        this.minute = m;
        this.second = s;
        return true;
    }

    // ---------------- Getters ----------------
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    // ---------------- Difference ----------------
    public long difference(NewTime other) {
        long thisSeconds = this.hour * 3600 + this.minute * 60 + this.second;
        long otherSeconds = other.hour * 3600 + other.minute * 60 + other.second;
        return Math.abs(thisSeconds - otherSeconds);
    }

    // ---------------- CompareTo ----------------
    @Override
    public int compareTo(NewTime other) {
        long thisSeconds = this.hour * 3600 + this.minute * 60 + this.second;
        long otherSeconds = other.hour * 3600 + other.minute * 60 + other.second;
        return Long.compare(thisSeconds, otherSeconds);
    }

    // ---------------- Clone ----------------
    @Override
    public NewTime clone() {
        try {
            return (NewTime) super.clone();
        } catch (CloneNotSupportedException e) {
            return new NewTime(this.toString());
        }
    }

    // ---------------- ToString ----------------
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
