package notificationSystem;

public class LoggingDecorator extends NotificationDecorator{
    public LoggingDecorator(Notification wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String user, String message) {
        System.out.println("[LOG] Sending message to "+user);
        wrapped.send(user,message);
        System.out.println("[LOG] Message sent "+user);
    }
}
