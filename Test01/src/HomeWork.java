import java.util.Scanner;

public class HomeWork {

        public static String getGrade(int score) {
            switch (score / 10) {
                case 10:
                case 9:
                    return "Grade A";
                case 8:
                    return "Grade B";
                case 7:
                    return "Grade C";
                case 6:
                    return "Grade D";
                default:
                    return "Grade F";
            }
        }
    public static void main(String[] args) {

//        Task 01:
//                Scanner sc = new Scanner(System.in);
//                System.out.print("Enter an integer: ");
//                int number = sc.nextInt();
//
//                switch (number % 2) {
//                    case 0:
//                        System.out.println("The number is Even.");
//                        break;
//                    case 1:
//                    case -1:  // for negative odd numbers
//                        System.out.println("The number is Odd.");
//                        break;
//

//        }

//            Task 02:
//        int rows = 5;
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (j % 2 == 1) {
//                    System.out.print("+ ");
//                } else {
//                    System.out.print("- ");
//                }
//            }
//            System.out.println();
//        }


//        task 03 :
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter second number: ");
//        int b = sc.nextInt();
//        System.out.print("Enter third number: ");
//        int c = sc.nextInt();
//
//        System.out.println("Press '1' for Addition");
//        System.out.println("Press '2' for Subtraction from max");
//        System.out.println("Press '3' for Multiplication");
//        int choice = sc.nextInt();
//
//        switch (choice) {
//            case 1:
//                System.out.println("Sum: " + (a + b + c));
//                break;
//            case 2:
//                int max = Math.max(a, Math.max(b, c));
//                int result = max;
//                if (max == a) result = a - b - c;
//                else if (max == b) result = b - a - c;
//                else result = c - a - b;
//                System.out.println("Subtraction result: " + result);
//                break;
//            case 3:
//                System.out.println("Product: " + (a * b * c));
//                break;
//            default:
//                System.out.println("Invalid Input");
//        }

//   sum of a 2 d array
//
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.print("Enter number of rows: ");
//        int rows = scanner.nextInt();
//
//        System.out.print("Enter number of columns: ");
//        int cols = scanner.nextInt();
//
//        int[][] matrix = new int[rows][cols];
//        int sum = 0;
//
//
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print("Element at [" + i + "][" + j + "]: ");
//                matrix[i][j] = scanner.nextInt();
//                sum += matrix[i][j];
//            }
//        }
//
//
//        System.out.println("Sum of all elements: " + sum);


        int score = 85;
        System.out.println("Score: " + score + " -> " + getGrade(score));

    }
}
