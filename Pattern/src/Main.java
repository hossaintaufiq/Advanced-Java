import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter your pattern value :  ");
        n = sc.nextInt();

        for(int i=0;i<n; i++){
            for(int j=0;j<=i;j++){
//                System.out.print("+");
                if(j%2==0){
                    System.out.print("+");
                }
                else{
                    System.out.print("-");
                }
            }

            System.out.println();
        }
    }
}