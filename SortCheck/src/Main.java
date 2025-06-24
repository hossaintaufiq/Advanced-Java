import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isSort(int[] arr) {
        int [] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        for(int i=0;i<temp.length-1;i++){
            for(int j=0;j<temp.length-i-1;j++){
                if(temp[j]>temp[j+1]){
                    int temp2 = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = temp2;
                }
            }
        }

        for(int i=0;i<arr.length; i++){
            if(arr[i]!=temp[i]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        if(isSort(arr)){
            System.out.println("Sorted array");
        }
        else{
            System.out.println("Not sorted array");
        }
    }
}