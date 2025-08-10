import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String nown1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        nown1 = scanner.nextLine();
        System.out.print("Enter another adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb (action word): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter a final adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println("--- Your Mad Libs Story ---");
        System.out.println("The " + adjective1 + " " + nown1 + " was feeling " + adjective2 + ".");
        System.out.println("It decided to " + verb1 + " to the " + adjective3 + " forest.");

        scanner.close();
    }
}