package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletTypeFactory {

    private static final Map<String, BulletType> bulletTypeRegistry = new HashMap<>();

    public static BulletType getBulletType(String bulletName) {
        if(!bulletTypeRegistry.containsKey(bulletName)) {
            bulletTypeRegistry.put(bulletName,new BulletType("black",90,4,10,100));
        }

        return bulletTypeRegistry.get(bulletName);
    }
}
