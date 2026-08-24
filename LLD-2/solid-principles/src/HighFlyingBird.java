public class HighFlyingBird implements Flyer{

    public void flyHigh() {
        System.out.println("This bird flies high");
    }

    @Override
    public void flyAltitude() {
        flyHigh();
    }
}
