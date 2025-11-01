import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Test1{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"))){
            String line;
            while ((line = reader.readLine())!=null){
                int sum = 0;
                String[] parts = line.split(",");
                for(String num : parts){
                    sum += Integer.parseInt(num);
                }
                System.out.println(sum);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}