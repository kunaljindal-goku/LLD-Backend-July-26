import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Client2 {

    static void printName(Animal animal) {
        System.out.println(animal.getName());
    }

    static void printNames(List<? extends Animal> animals) {
        for(Animal animal: animals) {
            System.out.println(animal.getName());
        }
    }

    static void addAnimal(List<? super Animal> animals) {
        animals.add(new Animal());
    }

    public static void main(String[] args) {
//        Animal a = new Animal("Tiger");
//        printName(a);
//
//        Animal a1 = new Dog("Dog");
//        printName(a1);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("D1"));
        dogs.add(new Dog("D2"));

        printNames(dogs);

        List<Creature> creatures = new ArrayList<>();
        addAnimal(creatures);
       // addAnimal(dogs);

    }
}
