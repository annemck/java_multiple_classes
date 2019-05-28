import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;

    @Before
    public void setup() {
        library = new Library(2);
        book = new Book("Harry Potter", "J.K. Rowling", "Fantasy");
        book2 = new Book("Lord of the Rings", "Tolkein", "Fantasy");
    }

    @Test
    public void libraryHasCapacity() {
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void canAddAndCountLibraryBooks() {
        library.add(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkIfLibraryFull() {
        assertEquals(false, library.libraryFull());
    }


    @Test
    public void cannotAddBookLibraryFull() {
        library.add(book);
        library.add(book2);
        Book book3 = new Book("Title", "Author", "Genre");
        library.add(book3);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void bookCanBeBorrowed() {
        library.add(book);
        library.borrowBook(book);
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canTrackBooksByGenre() {
        library.add(book);
        library.add(book2);
        assertEquals(2, library.getGenreCount("Fantasy"));
    }
}
