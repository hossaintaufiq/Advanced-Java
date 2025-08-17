import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
//        String fileName = "list.txt";
//
//        // Step 1: Create a list of items
//        List<String> items = new ArrayList<>();
//        items.add("Apple");
//        items.add("Banana");
//        items.add("Mango");
//        items.add("Orange");
//
//        // Step 2: Write the list to a file
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
//            for (String item : items) {
//                writer.write(item);
//                writer.newLine(); // write each item on a new line
//            }
//            System.out.println("List written to file successfully!");
//        } catch (IOException e) {
//            System.out.println("Error writing file: " + e.getMessage());
//        }
//
//        // Step 3: Read the list back from the file
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            String line;
//            System.out.println("\nReading list from file:");
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Error reading file: " + e.getMessage());
//        }

        String fileName = "List2.txt";

        String []list= {"Apple", "Banana", "Mango", "Orange"};


//        Writting process
        try(BufferedWriter writer =new BufferedWriter(new FileWriter(fileName))){

            for(String s: list){
                writer.write(s);
                writer.newLine();
            }
            System.out.println("List Written Successfully");

        }
        catch(Exception e){
            System.out.println(e);
        }

//        reading process
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;

            while((line= reader.readLine())!=null){
                System.out.println(line);
            }

            System.out.println("List Read Successfully");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}