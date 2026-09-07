package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) {

        List<Bullet> bullets = new ArrayList<>();
        for(int i=0;i<50000;i++) {
            bullets.add(new Bullet("ak47Bullet", (int) Math.random(), (int) Math.random()));
        }

        System.out.println("DEBUG");
    }
}
