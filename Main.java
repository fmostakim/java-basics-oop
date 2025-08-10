public class Main {
    public static void  main(String[] args){
        Field f1 = new Field(5.6, 4.3);
        System.out.println("First Object: ");
        f1.area();
        f1.perimeter();

        System.out.println("\nSecond Object: ");
        Field f2 = new Field(10, 8.5);
        f2.area();
        f2.perimeter();
    }
}
