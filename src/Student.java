import javax.security.auth.Subject;
import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Book> books = new ArrayList<>();

    public Student(String name, String email) {
        super(name, email);
    }
    public Student() {
        super();
    }

    public ArrayList<Book> getBooks() {
        return  books;
    }

    public void addBook(Book book) {
        books.add(book);
        Library.incrementTotalBooksIssued();
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Student Name: " + getName() +"\nEmail: " + getEmail() );
    }
}
