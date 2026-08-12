import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

       if(y==0) {
           System.out.println("Y cannot be zero");
           return;
       }

        System.out.println(x/y);

        try {
            FileReader fr = new FileReader("sample.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
