package notificationSystem;

public class Client {

    public static void main(String[] args) {
        Notification email = new Email();
        Notification sms = new Sms();

//        sms = new LoggingDecorator(sms);
//        sms.send("kunal", "Hello");

        email = new RetryDecorator(email);
        email = new LoggingDecorator(email);


        email.send("kunal", "Hello");

    }
}
