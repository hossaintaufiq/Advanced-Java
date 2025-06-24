import java.util.Scanner;

public class Main {
//
//    public static int GCD(int a, int b) {
//        int trialDivisor;
//        if(a==0||b==0 ){
//            return 0;
//        }
//        trialDivisor = (a<=b ? a:b);
//        while(a%trialDivisor!=0|| b%trialDivisor!=0){
//            --trialDivisor;
//
//        }
//        return trialDivisor;
//    }

    public static int GCD(int a , int b){
        int gcd=1;
        for(int i=1;i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        System.out.println("Enter b number");
        int b = input.nextInt();
        int gcd = GCD(a,b);
        System.out.println(gcd);
    }
}