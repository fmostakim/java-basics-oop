package Lab_CT;

public class LibraryBook {
    private  String title;
    private String author;
    private String ISBN;

    private  static  int totalBooks = 0;

    public LibraryBook(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        totalBooks++;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN(){
        return ISBN;
    }
    public void displayBookInfo(){
        System.out.println("    -Title: "+title+" , Author "+author+" ISBN: "+ISBN);
    }

    public static int getTotalBooks(){
        return totalBooks;
    }
}
