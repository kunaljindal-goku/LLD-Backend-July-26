import java.awt.print.Book;

class Librarian extends User {
    private String employeeNumber;

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("--- Librarian Dashboard ---");
        System.out.println("Name: " + getName());
        System.out.println("Employee #: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        // Design decision: librarians have unrestricted borrowing access.
        // No borrow count is tracked for them.
        return true;
    }

    public void addNewBook(Book book) { /* implementation later */ }

    public void removeBook(Book book) { /* implementation later */ }
}