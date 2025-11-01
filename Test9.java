import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        try(Scanner reader = new Scanner(new File("info.txt"));
            PrintWriter oddWriter = new PrintWriter("odd.txt");
            PrintWriter evenWriter = new PrintWriter("even.txt")){
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                try{
                    int id = Integer.parseInt(line);
                    if(id%2 ==0){
                        evenWriter.println(line);
                    }else{
                        oddWriter.println(line);
                    }
                }catch (NumberFormatException e){
                    System.out.println("Skipping invalid line: "+line);
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
