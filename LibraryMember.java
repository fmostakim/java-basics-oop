package Lab_CT;

public class LibraryMember {
    private String memberName;
    private int memberId;
    private LibraryBook borrowedBook;
    public LibraryMember(String memberName, int memberId){
        this.memberName = memberName;
        this.memberId = memberId;
        this.borrowedBook = null;
    }

    public void borroBook(LibraryBook book){
        if(borrowedBook == null){
            this.borrowedBook = book;
            System.out.println("'"+memberName+"' has successfully borrowed the book '"+book.getTitle()+"'");
        }else{
            System.out.println("Sorry, "+memberName+"! You must return '"+borrowedBook.getTitle()+"' before you borrow a new book");
        }
    }

    public void returBook(){
        if(borrowedBook != null){
            System.out.println("'"+memberName+"' has successfully retuned the book '"+borrowedBook.getTitle()+"'");
            this.borrowedBook = null;
        }else {
            System.out.println(memberName+", You have no book to return");
        }
    }

    public void displayMemberInfo(){
        System.out.println("Member Name: "+memberName+" (ID: "+memberId+" )");
        if(borrowedBook !=null){
            System.out.println("  Currently Borrowed Book: ");
            borrowedBook.displayBookInfo();
        }else {
            System.out.println("  No book currently borrowed.");
        }
        System.out.println("-----------------------------------");
    }
}
