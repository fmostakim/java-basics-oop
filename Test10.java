import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        try(Scanner reader = new Scanner(new File("Student.txt"));
            PrintWriter writer = new PrintWriter("mark.txt")){
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                String[] parts = line.split(" ");
                try{
                    String id = parts[0];
                    String name = parts[1];
                    int mark1 = Integer.parseInt(parts[2]);
                    int mark2 = Integer.parseInt(parts[3]);

                    int totalMark = mark1 + mark2;
                    writer.println(name+" "+totalMark);
                    System.out.println(name+" "+totalMark);
                }catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
