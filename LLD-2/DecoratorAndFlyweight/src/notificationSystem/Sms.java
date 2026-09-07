package notificationSystem;

public class Sms implements Notification{
    @Override
    public void send(String user, String message) {
        System.out.println("Sending SMS to "+user+ " message: "+message);
    }
}
