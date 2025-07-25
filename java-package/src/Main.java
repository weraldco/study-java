import test.sample.library.Book;
import test.sample.library.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Harry Potter", "JK Rowling"));
        library.addBook(new Book("Stailess Longanissa", "Bob Ong"));
        library.addBook(new Book("Stailess Longanissa", "Bob Ong"));

        library.displayBooks();
    }
}