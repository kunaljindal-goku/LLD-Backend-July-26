import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String bankName = sc.next();
        PhonePe phonePe = new PhonePe(bankName);

        phonePe.moneyTransfer("1323",5000);
    }
}
