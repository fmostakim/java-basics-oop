import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Book{
    private String title;
    private int pageCount;
    public Book(String title, int pageCount){
        this.title = title;
        this.pageCount = pageCount;
    }
    public String toString(){
        return "title: "+title+", pageCount: "+pageCount;
    }

    public int getPageCount(){
        return pageCount;
    }
}

class Mainp{
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Java Programming",500));
        bookList.add(new Book("Data Structure",400));
        bookList.add(new Book("C Programming",250));
        bookList.add(new Book("Python Programming",700));

        Collections.sort(bookList,new Comparator<Book>(){
            public int compare(Book b1, Book b2){
                return Integer.compare(b1.getPageCount(), b2.getPageCount());
            }
        });

        for(Book b : bookList){
            System.out.println(b);
        }


    }
}