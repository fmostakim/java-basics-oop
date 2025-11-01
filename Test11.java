import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        try(Scanner reader = new Scanner(new File("subject.txt"));
            PrintWriter writer = new PrintWriter("reverseSubject.txt")){
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                String[] parts = line.split(" ");
                try{
                    String part1 = parts[0];
                    String part2 = parts[1];
                    String part3 = parts[2];

                    writer.println(part3+" "+part2+" "+part1);
                    System.out.println(part3+" "+part2+" "+part1);
                }catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
