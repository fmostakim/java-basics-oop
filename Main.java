import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> foodPrices = new ArrayList<>();

        foodPrices.add(120.50);
        foodPrices.add(80.00);
        foodPrices.add(250.75);
        foodPrices.add(55.35);

        System.out.println("Before sorting: "+foodPrices);

        Collections.sort(foodPrices);
        System.out.println("After sorting: "+foodPrices);

    }
}