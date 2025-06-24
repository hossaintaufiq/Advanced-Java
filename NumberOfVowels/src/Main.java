import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int NumberOfVowels(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your string: ");

        String s = input.nextLine();
        System.out.println("Number of vowels: "+NumberOfVowels(s));

    }
}