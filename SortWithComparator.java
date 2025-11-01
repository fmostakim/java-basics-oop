import java.util.ArrayList;
import java.util.Comparator;

public class SortWithComparator {
    public static void main(String[] args) {
        ArrayList<Food> menu = new ArrayList<>();

        menu.add(new Food("Burger", 250));
        menu.add(new Food("Pizza", 400.0));
        menu.add(new Food("Coffee", 120.0));

        System.out.println("Before sorting menu: \n"+menu);

//        menu.sort(Comparator.comparing(Food::getName));
//        menu.sort(new Comparator<Food>(){
//            public int compare(Food f1, Food f2){
//                return f1.getName().compareTo(f2.getName());
//            }
//
//        });

        menu.sort(new Comparator<Food>() {
            public int compare(Food f1, Food f2){
                return Double.compare(f2.getPrice(),f1.getPrice());
            }
        });
        System.out.println("After sorting: \n");

        for(Food f : menu){
            System.out.println(f);
        }

    }
}
