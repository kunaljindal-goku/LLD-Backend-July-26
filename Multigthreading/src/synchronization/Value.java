package synchronization;

public class Value {

    private int x;

    public Value(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public synchronized void increment(int i) {
        this.x += i;
    }

    public synchronized void decrement(int i) {
        this.x -= i;
    }
}
