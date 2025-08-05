import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int numerator =0;
        int denominator=0;
         boolean validinput= false;


         while(!validinput){
             try{
                 System.out.print("Enter the numerator(integer): ");
                 numerator= input.nextInt();

                 System.out.print("Enter the denominator(interger): ");
                 denominator= input.nextInt();

                 int result= numerator/denominator;
                 System.out.println("Result : "+result);
                 validinput=true;
             }catch (InputMismatchException e){
                 System.out.println("Invalid Input.Please Enter Integers only.");
                 input.nextLine();
             }
             catch (ArithmeticException e){
                 System.out.println("Cann't devide by Zero.");
                 input.nextLine();
             }
         }
         input.close();
    }
}