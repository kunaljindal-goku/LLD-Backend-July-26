package birdsexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Client {

    public static void flyAllBirds(List<Flyable> birds) {
        for(Flyable b: birds) {
            b.fly();
        }
    }

    public static void main(String[] args) {
        List<Flyable> birds = new ArrayList<>();
        birds.add(new Dove());
        birds.add(new Dove());
        birds.add(new Pigeon());
        birds.add(new Crow());
     //   birds.add(new Penguin());

        flyAllBirds(birds);
    }
}
