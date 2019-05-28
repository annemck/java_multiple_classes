import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book("Harry Potter", "J.K. Rowling", "Fantasy");
    }

    @Test
    public void bookHasName() {
        assertEquals("Harry Potter", book.getName());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("J.K. Rowling", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Fantasy", book.getGenre());
    }
}
