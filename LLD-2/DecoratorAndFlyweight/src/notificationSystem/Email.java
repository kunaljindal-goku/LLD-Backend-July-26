package notificationSystem;

public class Email implements Notification{
    @Override
    public void send(String user, String message) {
        System.out.println("Sending Email to "+user+ " message: "+message);
    }
}
