package copyConstructor;

import java.util.DuplicateFormatFlagsException;

public class Client {

    public static void main(String[] args) {

        Route r1  = new Route(1,"Delhi","Mumbai");
        Fare f1 = new Fare(1,10000,r1);

        Fare f2 = new Fare(f1);

        System.out.println("DEBUG");
    }
}
