package flyweight;

public class BulletType {

    // INTRINSINC - common
    String color;
    int damage;
    int radius;
    double range;
    int speed;

    public BulletType(String color, int damage, int radius, double range, int speed) {
        this.color = color;
        this.damage = damage;
        this.radius = radius;
        this.range = range;
        this.speed = speed;
    }
}
