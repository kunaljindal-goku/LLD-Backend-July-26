import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;

public class ClientY {
    public static void main(String[] args) throws UnderAgeException {

        System.out.println("A");
        try {
            f1();
        } catch (ArithmeticException e) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }


        System.out.println("B");
    }

    public static void f1() throws UnderAgeException {
        f2();
    }

    public static void f2() throws UnderAgeException {
        throw new UnderAgeException("Age is less than 18");
    }
}
