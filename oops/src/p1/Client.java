package p1;

import java.security.interfaces.ECKey;

public class Client {

    public static void main(String[] args) {
        Elephant e = new Elephant();
        System.out.println(e.name);
        System.out.println(e.legs);
    }
}
