import java.net.SocketOption;

public class LowFlyingBird implements Flyer{

    public void lowFly() {
        System.out.println("This bird flies low");
    }

    @Override
    public void flyAltitude() {
        lowFly();
    }
}
