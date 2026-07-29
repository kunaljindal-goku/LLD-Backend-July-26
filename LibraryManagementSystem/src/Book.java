public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book() {
        this.isAvailable = true;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public Book(Book other) {
        this.isbn = other.isbn;
        this.title = other.title;
        this.author = other.author;
        this.isAvailable = true; // Because if you are creating a new Book in your library, by default it should be available.
    }

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnItem(User user) {
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    // Getters for children to use
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Left abstract — each book type describes itself differently
    public abstract void displayBookDetails();
}