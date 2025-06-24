import java.util.Scanner;

public class Main {

    // This function removes duplicate characters from the input string
    public static String removeDuplicates(String input) {

        String result = ""; // To store the final string without duplicates

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if current character is already in the result string
            boolean isDuplicate = false;
            for (int j = 0; j < result.length(); j++) {
                if (currentChar == result.charAt(j)) {
                    isDuplicate = true; // We already added this character
                    break;
                }
            }

            // If not duplicate, add it to the result string
            if (!isDuplicate) {
                result += currentChar;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        String noDuplicates = removeDuplicates(userInput);

        System.out.println("String without duplicates: " + noDuplicates);
    }
}
