package flyweight;

public class Bullet {

    private BulletType bulletType;
    private int x;
    private int y;

    public Bullet(String bulletName, int x, int y) {
        this.bulletType = BulletTypeFactory.getBulletType(bulletName);
        this.x = x;
        this.y = y;
    }
}
