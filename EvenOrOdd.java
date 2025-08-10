import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner inpput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = inpput.nextInt();

        if(num % 2 == 0){
            System.out.println(num+" is an even number.");
        }else{
            System.out.println(num+" is an odd number.");
        }
    }

}
