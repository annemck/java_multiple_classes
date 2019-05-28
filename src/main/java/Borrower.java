import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<Book>();
    }


    public int numberOfBooks() {
        return this.borrowedBooks.size();
    }

    public void borrowBook(Library library, Book book) {
        library.borrowBook(book);
        this.borrowedBooks.add(book);
    }

    public void returnBook(Library library, Book book) {
        library.add(book);
        this.borrowedBooks.remove(book);
    }
}
