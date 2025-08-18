import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "account.txt";
        double initialBalance = 5000;  // starting balance

        // Step 1: Write initial balance to file
        try {
//            BufferedReader br = new BufferedReader(new FileReader(fileName));
//            FileWriter fw = new FileWriter(fileName);
//            fw.write(String.valueOf(initialBalance));
//            fw.close();

            BufferedWriter bw= new BufferedWriter(new FileWriter(fileName));
            bw.write("Account Balance: " + initialBalance + "\n");
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            System.out.println("Error writing balance to file!");
        }

        // Step 2: Read balance from file
        double balance = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            balance = Double.parseDouble(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading balance from file!");
        }

        // Step 3: Try withdrawing
        double withdrawAmount = 6000; // sample withdrawal
        try {
            if (withdrawAmount > balance) {
                // Throw our custom exception
                throw new NegativeBalanceException("Withdrawal denied! Insufficient funds.");
            } else {
                balance -= withdrawAmount; // deduct money
                // Update balance in file
                FileWriter fw = new FileWriter(fileName);
                fw.write(String.valueOf(balance));
                fw.close();
                System.out.println("Withdrawal successful! New balance: " + balance);
            }
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error updating balance!");
        }
    }
}