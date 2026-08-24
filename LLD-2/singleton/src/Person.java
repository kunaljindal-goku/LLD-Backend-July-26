public class Person {

    static {
        System.out.println("Person class is loaded");
    }

    private String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Constructor");
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
