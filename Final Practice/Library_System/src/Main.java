import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    String fileName = "library.txt";

    // Step 1: Create library file with some books
        try {
        FileWriter fw = new FileWriter(fileName);
        fw.write("Harry Potter\n");
        fw.write("To Kill a Mockingbird\n");
        fw.write("The Hobbit\n");
        fw.close();
    } catch (IOException e) {
        System.out.println("Error creating library file!");
    }

    // Step 2: Ask user for a book title
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title of the book you want to borrow: ");
    String requestedBook = sc.nextLine();

    // Step 3: Try to borrow book
        try {
        borrowBook(requestedBook, fileName);
        System.out.println("You have successfully borrowed '" + requestedBook + "'.");
    } catch (BookNotAvailableException e) {
        System.out.println(e.getMessage());
    }
}

        // Method to borrow book
        public static void borrowBook(String title, String fileName) throws BookNotAvailableException {
            boolean found = false;

            try {
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                String line;

                while ((line = br.readLine()) != null) {
                    if (line.equalsIgnoreCase(title.trim())) {
                        found = true;
                        break;
                    }
                }
                br.close();
            } catch (IOException e) {
                System.out.println("Error reading library file!");
            }

            if (!found) {
                throw new BookNotAvailableException("The book '" + title + "' is not available.");
            }
        }
