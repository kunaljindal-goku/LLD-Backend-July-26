package notificationSystem;

public class RetryDecorator extends NotificationDecorator{

    private final int MAX_COUNT = 5;

    public RetryDecorator(Notification wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String user, String message) {
        for(int i=0;i<MAX_COUNT;i++) {
        try {
            int x = 5/0;
            wrapped.send(user,message);
            System.out.println("Message sent");

        }
        catch (Exception e) {
            System.out.println("Message failed. Retrying....");
        }
        }
    }
}
