public class Client {

    public static void main(String[] args) {
//        Student s = new Student("Virat",37,90,"DSML",1,"ABC University",2021,"235343");

//        Student s = new Student();
//        s.setGradYear(2023);
//        Builder builder = Student.getBuilder();
//        builder.setName("Virat");
//        builder.setAge(37);
//        Student s = new Student(builder);


        Student s = Student.getBuilder()
                .setAge(37)
                .setName("Virat")
                .setGradYear(2023)
                .build();

        

      //  Student s1 = new Student(new Builder());

    }
}
