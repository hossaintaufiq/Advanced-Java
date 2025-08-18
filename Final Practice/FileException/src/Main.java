import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String fileName= "test.txt";
//
//
//        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
//            writer.write("Hello From test");
//            System.out.println("File write successfully");
//        }catch (Exception e){
//            System.out.println(e);
//        }
//
//
//
////        reading
//        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
//            String line;
//
//            while((line=reader.readLine())!=null){
//                System.out.println(line);
//            }
//            System.out.println("File read successfully");
//        }catch (Exception e){
//            System.out.println(e);
//        }

        String filename= "final.txt";

        try{
            BufferedWriter writer= new BufferedWriter(new FileWriter(filename));
            writer.write("final practice");
            writer.newLine();
            writer.close();
            System.out.println("Writing done:");
        }catch(Exception e){
            System.out.println(e);
        }

//        read form the file
        try{
            BufferedReader reader= new BufferedReader(new FileReader(filename));
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
            System.out.println("Reading done:");
        }catch (Exception e){
            System.out.println(e);
        }



    }
}