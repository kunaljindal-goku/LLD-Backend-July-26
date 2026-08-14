package StreamsAdvanced;

public class Book extends Item {
    private String author;

    public Book(String id, String name, double price, int quantity, String author) {
        super(id, name, quantity, price);
        this.author = author;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}