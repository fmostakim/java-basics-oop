import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean isDivisibleBy2 = (number%2 == 0);
        boolean isDivisibleBy3 = (number%3 == 0);


        if(isDivisibleBy2 ^ isDivisibleBy3){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        input.close();
    }
}
