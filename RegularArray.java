import java.util.Scanner;
public class RegularArray{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter the total number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the total number of columns: ");
        int cols = scanner.nextInt();

        int[][] regularArray = new int[rows][cols];
        System.out.println("-------------------");
        System.out.println("Now, enter the elements for the array: ");

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print("Enter value for row "+i+", column "+j+": ");
                regularArray[i][j] = scanner.nextInt();

            }
        }
        scanner.close();

        System.out.println("------------------");
        System.out.println("The regular array you entered is: ");

        for(int i = 0 ; i<rows; i++){
            for(int j = 0; j<cols;j++){
                System.out.print(regularArray[i][j]+" ");
            }
            System.err.println("");
        }


    }
}