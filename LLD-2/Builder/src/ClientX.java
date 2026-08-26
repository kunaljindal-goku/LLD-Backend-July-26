public class ClientX {


    // Create an Instructor class with name, email, salary, age, company attributes.
    // instructor shluld only be created if he is working professional.
    // Builder
    public static void main(String[] args) {
        Instructor instructor = Instructor.getBuilder()
                .setAge(30)
                .setEmail("jnask")
                .setName("Virat")
                .setCompany("jdsakd")
                .build();
    }

}
