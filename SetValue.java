import java.util.ArrayList;

public class SetValue {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Before Change: "+fruits);

        fruits.set(1,"Mango");

        System.out.println("After Change: "+fruits);
    }
}
