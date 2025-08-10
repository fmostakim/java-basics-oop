import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter an operator(+, -, *, /): ");
        char operator = input.next().charAt(0);
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        double result;

        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.println("The result is: "+result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result is: "+result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result is: "+result);
                break;
            case '/':
                if(num2==0){
                    System.out.println("Error cause denominator is zero.");
                }else {
                    result = num1 / num2;
                    System.out.println("The result is: "+result);

                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;

        }
    }
}
