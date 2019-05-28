import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower person;
    private Library library;
    private Book book;

    @Before
    public void setup() {
        person = new Borrower();
        library = new Library(100);
        book = new Book("Harry Potter", "J.K. Rowling", "Fantasy");
    }

    @Test
    public void borrowedBooksStartsEmpty() {
        assertEquals(0, person.numberOfBooks());
    }

    @Test
    public void canBorrowBookFromLibrary() {
        library.add(book);
        person.borrowBook(library, book);
        assertEquals(1, person.numberOfBooks());
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canReturnBookToLibrary() {
        library.add(book);
        person.borrowBook(library, book);
        person.returnBook(library, book);
        assertEquals(0, person.numberOfBooks());
        assertEquals(1, library.bookCount());
    }
}
