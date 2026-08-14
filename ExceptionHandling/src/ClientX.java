import java.io.FileNotFoundException;

public class ClientX {

    public static void main(String[] args) {

        try {
            int x = 10;
            System.out.println("B");
            if (x == 10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println("C");
        } catch (ArithmeticException e) {
            System.out.println("D");
        }
        finally {
           throw new ArithmeticException();
        }

    }
}
