import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {

    ArrayList<Book> lib = new ArrayList<>();

    // Use recurring ArrayList for titles, publishers, years.
    ArrayList<Book> query = new ArrayList<>();

    public Library() {}

    public void addBook(Book newBook) { lib.add(newBook); }

    public void printBooks() {
        for (Book b : lib) { System.out.println(b); }
    }

    public ArrayList<Book> searchByTitle(String title) {
        query.clear();

        for (Book b : lib) {
            if (b.title().contains(title)) { query.add(b); }
        }

        return query; }

    public ArrayList<Book> searchByPublisher(String publisher) {
        query.clear();

        for (Book b : lib) {
            if (b.publisher().contains(publisher)) { query.add(b); }
        }

        return query; }

    public ArrayList<Book> searchByYear(int year) {
        query.clear();

        for (Book b : lib) {
            if (b.year() == year) { query.add(b); }
        }

        return query; }
}
