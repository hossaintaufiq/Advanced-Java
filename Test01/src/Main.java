import java.util.Scanner;

public class Main {

    public static String getGrade(int score) {
        switch (score / 10) {
            case 10:
            case 9:
                return "Grade A";
            case 8:
                return "Grade B";
            case 7:
                return "Grade C";
            case 6:
                return "Grade D";
            default:
                return "Grade F";
        }
    }

    public static void main(String[] args) {
        int score = 85;
        System.out.println("Score: " + score + " -> " + getGrade(score));
    }
}