import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean isPrime(int n) {
        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimeFactors(int n){
        for(int i=2;i<=n;i++){
            if(n%i==0){
               boolean flag =  isPrime(i);
               if(flag){
                   System.out.println(i);
               }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
//        System.out.println("Prime Factors of "+n+" : ");
        PrimeFactors(n);
    }
}