import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static String Convert(int n){
        String s="";
        int i=0;

        while(n>0){
            s.charAt(i)= n%2;
            n=n/2;
        }

        return s;

    }
    static String Convert(double n){


    }
    static int Convert(char ch){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
}