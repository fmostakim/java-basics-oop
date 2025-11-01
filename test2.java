import java.util.ArrayList;

public class test2 {


    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        mylist.add(50);

        for(int s : mylist){
            System.out.println(s*5);
        }
    }

}
