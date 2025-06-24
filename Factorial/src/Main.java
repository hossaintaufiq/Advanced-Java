import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int factorial(int n){
        int factorial=1;

        for(int i=1;i<=n;i++){
            factorial*=i;

        }
        return factorial ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println("The factorial of "+n+" is "+factorial(n));
    }
}