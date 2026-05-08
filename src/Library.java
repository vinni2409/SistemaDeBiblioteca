import java.util.ArrayList;

public class Library {
    private ArrayList<Book> BookList;

    public Library() {
        BookList = new ArrayList<>();
    }

    public void AddBook(Book book) {
        if (searchBook(book.getIsbn()) != null) {
            System.out.println("A book with ISBN " + book.getIsbn() + " already exists.");
        }else{
            BookList.add(book);
            System.out.println("Book: " + book.getTitle() + ", added successfully.");
        }
    }

    public void ListBook(){
        if(BookList.isEmpty()){
            System.out.println("No books in library");
        }else{
            for(Book book : BookList){
                book.showInfo();
                System.out.println("......");
            }
        }
    }

    public Book searchBook(String isbn) {
        for (Book book : BookList) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void removeBook(String isbn){
        Book book = searchBook(isbn);
        if(book != null){
            BookList.remove(book);
            System.out.println("Book / " + book.getTitle() + "/ removed successfuly.");
        }else{
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void lendBook(String isbn){
        Book book = searchBook(isbn);
        if (book != null) {
            book.lendBook();
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void returnBook(String isbn){
        Book book = searchBook(isbn);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }
}
