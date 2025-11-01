import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        try(Scanner reader = new Scanner(new File("numbers.txt"));
            PrintWriter writer = new PrintWriter("min.txt")) {
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                try {
                    int number = Integer.parseInt(line);
                    if(number<min){
                        min = number;
                    }

                }catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }
            }
            writer.println(min);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Minimum number: "+min);
    }
}
