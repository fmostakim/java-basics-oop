import java.util.ArrayList;
import java.util.Scanner;
public class ReadIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("How many numbers do you want to add?");
        int count = input.nextInt();

        System.out.println("Write down "+count+" numbers: ");
        for(int i = 0; i<count;i++){
            int num = input.nextInt();
            numbers.add(num);
        }

        System.out.println("Here are the numbers you added: "+numbers);
        input.close();
    }
}
