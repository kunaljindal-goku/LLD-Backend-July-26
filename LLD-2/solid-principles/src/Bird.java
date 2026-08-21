public abstract class Bird {

    private String name;
    private int age;
    private String color;


    public Bird(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }


    void eat() {
        System.out.println("Eating");
    }
}
