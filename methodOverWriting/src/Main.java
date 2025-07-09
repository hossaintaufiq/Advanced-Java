import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//    static String Convert(int n){
//        String s="";
//        int i=0;
//
//        while(n>0){
//            s.charAt(i)= n%2;
//            n=n/2;
//        }
//
//        return s;
//
//    }
//    static String Convert(double n){
//
//
//    }
//    static int Convert(char ch){
//
//    }

//    public static String removeDuplicates(String s){
//        String result="";
//        for(int i=0;i<s.length();i++){
//            char ch=s.charAt(i);
//            boolean flag=false;
//            for(int j=0;j<result.length();j++){
//                if(result.charAt(j)==ch){
//                    flag=true;
//                    break;
//                }
//            }
//            if(!flag){
//                result+=ch;
//            }
//        }
//        return result;
//    }

    public static int GCD(int a,int b){
        int gcd=1;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0 &&b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
//        int n = sc.nextInt();
//        System.out.println("Enter the string: ");
//        String s = sc.nextLine();
//        System.out.println(removeDuplicates(s));
        System.out.println(GCD(a,b));
    }
}