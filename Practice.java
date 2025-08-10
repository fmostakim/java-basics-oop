import java.util.Scanner;
public class Practice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print ("Enter your name: ");
        String name = scanner.nextLine();

        

        System.out.println("Hi "+name);
        System.out.println("You are "+age+" years old");
        scanner.close();
    }
}
