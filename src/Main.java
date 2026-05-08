public class Main{
    public static void main(String[] args) {
        Book book1 = new Book("One Piece", "Enchiro Oda", "123", 3);
        Book book2 = new Book("Demon Slayer", "Koyohgru Gotouge", "2525", 2);
        Book book3 = new Book("Harry Potter", "J.K. Rowling", "2410", 4);

        Library library = new Library();

        library.AddBook(book1);
        library.AddBook(book2);
        library.AddBook(book3);
        library.AddBook(new Book("Duplicate", "Author", "111", 5));

        System.out.println("\n Resgistered books");
        library.ListBook();

        System.out.println("\n Lending books");
        library.lendBook("123");
        library.lendBook("123");
        library.lendBook("123");
        library.lendBook("123");

        System.out.println("\n Returning book");
        library.returnBook("123");

        System.out.println("\n Searching book by ISBN");

        Book found = library.searchBook("2525");
        if (found != null) {
            found.showInfo();
        }else{
            System.out.println("Book not found");
        }

        System.out.println("\n Removing book");
        library.removeBook("2410");
        library.ListBook();

    }
}