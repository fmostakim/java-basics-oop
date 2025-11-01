import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        try(Scanner reader = new Scanner(new File("info.txt"));
            PrintWriter writer = new PrintWriter("out.txt")){
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                for (char c : line.toCharArray()){
                    if(Character.isDigit(c)){
                        System.out.println(c);
                        writer.println(c);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
