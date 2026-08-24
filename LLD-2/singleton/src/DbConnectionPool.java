import java.util.ArrayList;
import java.util.List;

public class DbConnectionPool {

    private String url;
    private String password;
    private List<String> connections;
    private int maxPoolSize;

    /**
     * Eager intialized singleton
     */
      //   private static final DbConnectionPool instance = new DbConnectionPool("url", "pass", 5);
    private static DbConnectionPool instance;

    private DbConnectionPool(String url, String password, int maxPoolSize) {
        this.url = url;
        this.password = password;
        this.maxPoolSize = maxPoolSize;
        this.connections = new ArrayList<>(maxPoolSize);
    }

    /**
     * Double checked locking
     * @return
     */
    public static DbConnectionPool getInstance() {
        if (instance == null) {
            synchronized (DbConnectionPool.class) {
                if (instance == null) {
                    instance = new DbConnectionPool("url", "pass", 5);
                }
            }
        }
        return instance;
    }


//    public static DbConnectionPool getInstance() {
//        return instance;
//    }
}
