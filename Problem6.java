import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        double perimeter = 2 * 3.1416* radius;

        double area = 3.1416 * radius * radius;

        System.out.println("Perimeter "+perimeter);
        System.out.println("Area: "+area);
    }
}
