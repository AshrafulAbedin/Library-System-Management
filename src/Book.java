public class Book {
    private String title;
    private String author;
    private int isbn;
    private int price;

    public Book(String title, String author, int isbn, int price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public Book(){
        this("Unknown", "Unknown", 0, 0);
    }

    //getter/setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book: " + title + ", \nAuthor: " + author + ", \nISBN: " + isbn + ", \nPrice: " + price;
    }


    public void displayInfo()
    {
        System.out.println(this);
    }
}
