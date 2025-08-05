import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner input= new Scanner(System.in);

       SavingsAccount account= new SavingsAccount();
       boolean running = true;

       System.out.println("Welcome to the Savings Account app!");

       while(running){
           System.out.println("\nChoose an option:");
           System.out.println("1. Deposit");
           System.out.println("2. Withdraw");
           System.out.println("3. Check Balance");
           System.out.println("4. Exit");

           try{
               System.out.print("Your Choice: ");
               int choice = Integer.parseInt(input.nextLine());

               switch (choice){
                   case 1:
                       System.out.print("Enter deposit amount: ");
                       double depositAmount = Double.parseDouble(input.nextLine());
                       account.deposit(depositAmount);
                       break;

                   case 2:
                       System.out.print("Enter withdrawal amount: ");
                       double withdrawAmount = Double.parseDouble(input.nextLine());
                       account.withdraw(withdrawAmount);
                       break;
                   case 3:
                       System.out.println("Current Balance: " + account.getBalance());
                       break;
                   case 4:
                       System.out.println("Thank you for using the app!");
                       running = false;
                       break;
                   default:
                       System.out.println("Invalid choice. Try again.");
               }
           }
           catch (NumberFormatException e){
               System.out.println("Invalid input. Please enter numbers only.");
           } catch (withdrawalException e) {
               System.out.println("Error: " + e.getMessage());
           }

       }
        input.close();
    }
}