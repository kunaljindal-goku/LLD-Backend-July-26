package notificationSystem;

public abstract class NotificationDecorator implements Notification {

    protected Notification wrapped;

    public NotificationDecorator(Notification wrapped) {
        this.wrapped = wrapped;
    }
}
