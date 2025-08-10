import  java.util.Scanner;
import java.util.stream.StreamSupport;

public class FindLargeNumber {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        if (num1> num2){
            System.out.println(num1 + " is the largest number.");
        }else{
            System.out.println(num2 + " is the largest number.");
        }
    }
}
