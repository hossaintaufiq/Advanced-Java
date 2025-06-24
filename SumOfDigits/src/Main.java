import java.util.Scanner;


public class Main {

    public static int SumOfDigits(int n) {
        int sum=0;

        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num= input.nextInt();

        int sum = SumOfDigits(num);

        System.out.println("The sum of digits is: " + sum);
    }
}