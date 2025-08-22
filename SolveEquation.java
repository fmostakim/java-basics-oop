package Lab_CT;
import java.util.Scanner;

class QuadraticEquation{
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return (b*b) - (4*a*c);
    }

    public void  displayRoots(){
        double discriminant = getDiscriminant();
        if(discriminant>0){
            double root1 = (-b+ Math.sqrt(discriminant))/ (2*a);
            double root2 = (-b- Math.sqrt(discriminant))/ (2*a);
            System.out.println("Root 1: "+root1);
            System.out.println("Root 2 : "+root2);
        }else if(discriminant == 0){
            double root = -b/(2*a);
            System.out.println("Here is only one root: ");
            System.out.println("Root: "+root);
        }else {
            System.out.println("This equation don't have any real root.");
        }
    }
}

public class SolveEquation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c for ax^2 + bx + c = 0 equation:  ");
        System.out.print("Enter the value of a: ");
        double a = input.nextByte();
        System.out.print("Enter the value of b: ");
        double b = input.nextByte();
        System.out.print("Enter the value of c: ");
        double c = input.nextByte();


        QuadraticEquation eq = new QuadraticEquation(a, b, c);
        eq.displayRoots();
        input.close();
    }
}
