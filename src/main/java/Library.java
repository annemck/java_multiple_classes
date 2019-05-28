import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> genreCount;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
        this.genreCount = new HashMap<String, Integer>();
    }


    public int getCapacity() {
        return this.capacity;
    }

    public void add(Book book) {
        if (!libraryFull()) {
            this.books.add(book);
            String genre = book.getGenre();
            if (genreCount.containsKey(genre)){
                genreCount.put(genre, genreCount.get(genre) + 1);
            } else {
                genreCount.put(genre, 1);
            }
        }
    }

    public int bookCount() {
        return this.books.size();
    }

    public boolean libraryFull() {
        if (this.bookCount() == this.capacity){
            return true;
        }
        return false;
    }

    public void borrowBook(Book book) {
        this.books.remove(book);
    }

    public int getGenreCount(String genre){
        return this.genreCount.get(genre);
    }

}
