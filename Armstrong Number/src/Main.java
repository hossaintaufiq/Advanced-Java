import  java.util.*;

public class Main {

    public static boolean isArmstrong(int num){
        int temp = num;
        int sum=0;

        while(temp!=0){
            int lastDigit = temp%10;
            sum+= Math.pow(lastDigit,3);

            temp=temp/10;
        }

        if(sum==num) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//        if(isArmstrong(num)){
//            System.out.println("Armstrong number");
//        }
//        else{
//            System.out.println("Not an Armstrong number");
//        }


        System.out.print("Enter two numbers: ");
        int x= in.nextInt();
        int y = in.nextInt();
        int result = 1;

        for(int i=1;i<=y;i++){
            result*=x;
        }

        System.out.println(x+" Power "+ y + " Will be = " + result);
    }
}