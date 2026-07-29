public abstract class User {
    private static int idCounter = 0;
    private static int totalUsers = 0;       // tracks total users ever created
    private final String userId;
    private String name;
    private String contactInfo;

    // Default constructor
    public User() {
        this.userId = generateUniqueId();
        totalUsers++;
    }

    // Parameterized constructor
    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        totalUsers++;
    }

    // Copy constructor — copies the data, but generates a NEW unique ID
    // A copied user is treated as a new registration in the system
    public User(User other) {
        this.userId = generateUniqueId();
        this.name = other.name;
        this.contactInfo = other.contactInfo;
        totalUsers++;
    }

    private static String generateUniqueId() {
        return "U-" + (++idCounter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getUserId() {
        return userId;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    // Every child MUST implement these
    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();
}