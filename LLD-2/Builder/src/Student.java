import java.util.HexFormat;

public class Student {

    String name;
    int age;
    double psp;
    String batch;
    long id;
    String universityName;
    int gradYear;
    String phoneNumber;

    public static Builder getBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Student() {
    }

    //    public Student(String name,
//                   int age,
//                   double psp,
//                   String batch,
//                   long id,
//                   String universityName,
//                   int gradYear,
//                   String phoneNumber) {
//        if(gradYear < 2022) {
//            throw new RuntimeException("Grad year has to be greater than 2022");
//        }
//        this.name = name;
//        this.age = age;
//        this.psp = psp;
//        this.batch = batch;
//        this.id = id;
//        this.universityName = universityName;
//        this.gradYear = gradYear;
//        this.phoneNumber = phoneNumber;
//    }


//    public Student(Map<String, Object> map) {
//        if ((int) map.get("gradYear") < 2022) {
//            throw new RuntimeException("Grad year has to be greater than 2022");
//        }
//
//        if (map.containsKey("name")) {
//            this.name = (String) map.get("name");
//        }
//        this.age = (int) map.get("age");
//
//        // all the attributes
//    }

    private Student(Builder builder) {
       // super(builder.s);
        this.gradYear = builder.getGradYear();
        this.name = builder.getName();
    }

    static class Builder {

        private String name;
        private int age;
        private double psp;
        private String batch;
        private long id;
        private String universityName;
        private int gradYear;
        private String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            validate();
            return new Student(this);
        }

        public void validate() {
            if (this.gradYear < 2022) {
                throw new RuntimeException("Grad year has to be greater than 2022");
            }
        }
    }
}
