public class Book {
    private String Title;
    private String Author;
    private String Isbn;
    private int AvaibleQuantity;
    private int TotalQuantity;

    public Book( String Title, String Author, String Isbn, int AvaibleQuantity){
        this.Title = Title;
        this.Author = Author;
        this.Isbn = Isbn;
        this.AvaibleQuantity = AvaibleQuantity;
        this.TotalQuantity = AvaibleQuantity;
    }

    public String getTitle(){
        return Title;
    }

    public String getAuthor(){
        return Author;
    }

    public String getIsbn(){
        return Isbn;
    }

    public int getAvaibleQuantity(){
        return AvaibleQuantity;
    }

    public void showInfo(){
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Isbn: " + Isbn);
        System.out.println("Avaible quantity: " + AvaibleQuantity);
    }

    public void lendBook(){
        if(AvaibleQuantity > 0){
            AvaibleQuantity--;
            System.out.println("Book / " + Title + "/ Succefully lent. Remaining copies: " + AvaibleQuantity);
        }else {
            System.out.println("Book /" + Title + "/ Is not avaible for lending.");
        }
    }

    public void returnBook() {
        if(AvaibleQuantity < TotalQuantity){
            AvaibleQuantity++;
            System.out.println("Book /" + Title + "/ Succefully returned. Avaible copies: " + AvaibleQuantity);
        }else {
            System.out.println("All copies of /" + Title + "/ are already in the library.");
        }
    }
}
