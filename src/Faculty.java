import java.util.ArrayList;

public class Faculty extends Person {

    private ArrayList<Book> books = new ArrayList<>();

    public Faculty(String name, String email) {
        super(name, email);
    }

    public Faculty() {
        super();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
        Library.incrementTotalBooksIssued();
    }

    @Override
    public void displayDetails() {
        System.out.println("Faculty Name: " + getName() + "\nEmail: " + getEmail());
    }
}
