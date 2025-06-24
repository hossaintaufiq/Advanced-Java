import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String reverseString(String str) {
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            rev+=ch;

        }

        return rev;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(reverseString(s));
    }
}