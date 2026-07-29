class NovelBook extends Book {
    private String genre;

    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("NovelBook | Title: " + getTitle()
                + " | Author: " + getAuthor()
                + " | Genre: " + genre);
    }
}