import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=input.nextInt();
        boolean Prime=isPrime(num);

        if(Prime){
            System.out.println("Prime");

        }
        else{
            System.out.println("Not Prime");
        }
    }
}