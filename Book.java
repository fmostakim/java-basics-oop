public class Book {
    private String Title;
    private String author;
    private double price;

    Book(String Title, String author, double price){
        this.Title = Title;
        this.author = author;
        this.price = price;
    }

    public String getTitle(){
        return Title;
    }

    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setTitle(String t){
        Title = t;
    }
    public  void setAuthor(String a){
        author = a;
    }
    public void setPrice(double p){
        price = p;
    }

    public void display(){
        System.out.println("Title: "+Title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);


    }
}
