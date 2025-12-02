public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        Faculty f = new Faculty("David Malan", "dm@mit.edu");


        Book b1 = new Book("C Programming", "K N King", 12345, 1450);
        Book b2 = new Book("Clean Code", "Robert Martin", 67890, 1500);

        s.addBook(b1);
        f.addBook(b2);

        Library.printPersonDetails(s);
        System.out.println();
        Library.printPersonDetails(f);


        System.out.println("\nTotal books issued: " + Library.getTotalBooksIssued());
    }
}