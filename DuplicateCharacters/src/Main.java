import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String removeDuplicates(String s) {
//        Scanner input = new Scanner(System.in);
//        String result = "";
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            boolean found = false;
//
//            // Check if the character already exists in the result
//            for (int j = 0; j < result.length(); j++) {
//                if (result.charAt(j) == c) {
//                    found = true;
//                    break;
//                }
//            }
//
//            // If not found, add to result
//            if (!found) {
//                result += c;
//            }
//        }
//        return result;

        String result="";
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            boolean flag=false;

            for(int j=0;j<result.length();j++){
                if(result.charAt(j)==c){
                    flag=true;
                    break;
                }
            }

            if(!flag){
                result += c;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = input.nextLine();
        String result= removeDuplicates(s);
        System.out.println(result);


    }
}