package Lab_CT;

public class LibrarySystem {
    public static void main(String[] args){
        System.out.println("Adding new book to the library...");
        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho", "9853593575");
        LibraryBook book2 = new LibraryBook("Object-Oriented Programmming", "Grady Booch", "453495349534");
        LibraryBook book3 = new LibraryBook("Java: The complete Reference", "Herbert Schildt", "5745749574");

        System.out.println("The total number of book in library: "+ LibraryBook.getTotalBooks());
        System.out.println("================================================");
        LibraryMember member1 = new LibraryMember("Alice", 101);
        LibraryMember member2 = new LibraryMember("Barkat",102);
        System.out.println("Initial situation of memeber: ");
        member1.displayMemberInfo();
        member2.displayMemberInfo();
        System.out.println("\nBook lending process is starting: ");
        member1.borroBook(book1);
        member2.borroBook(book2);
        System.out.println("Status of member after borrowing book: ");
        member1.displayMemberInfo();
        member2.displayMemberInfo();
        System.out.println("\nTrying to lend Alice another book..");
        member1.borroBook(book3);

        System.out.println("Book return Process...");
        member1.returBook();
        member1.displayMemberInfo();

        System.out.println("\n Alice is lending new book....");
        member1.borroBook(book3);
        member1.displayMemberInfo();

    }
}
