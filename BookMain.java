public class BookMain {
    public static void main(String[] aargs){
       Book book1 = new Book("Amar Bangladesh", "Mostakim Billa", 500);
       book1.display();

       System.out.println("");

       Book book2 = new Book("The C programming language", "Brian W. Kernighan", 510);
       book2.display();
    }
}
