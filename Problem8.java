import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        double kilometers = input.nextDouble();

        System.out.print("Enter the time in minutes: ");
        double minutes = input.nextDouble();

        System.out.print("Enter the time in seconds: ");
        double seconds = input.nextDouble();

        double miles = kilometers/1.6;

        double hours = (minutes/60.0) + (seconds / 3600.0);

        if(hours > 0){
            double AvgSpeed = miles/hours;
            System.out.println("The average speed is: "+AvgSpeed+" miles per hour.");
        }else {
            System.out.println("Erro! Check the input again. ");
        }

        input.close();

    }
}
