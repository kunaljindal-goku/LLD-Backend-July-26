public class Instructor {

//    name, email, salary, age, company
    // inst should be a working professional
    // name is mandatory

    private String name;
    private String email;
    private int salary;
    private int age;
    private String company;

    public static Builder getBuilder() {
        return new Builder();
    }
    private Instructor(Builder builder) {
        this.age = builder.age;
        this.company = builder.company;
        this.salary = builder.salary;
        //
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    static class Builder {
        private String name;
        private String email;
        private int salary;
        private int age;
        private String company;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Instructor build() {
            validate();
            return new Instructor(this);
        }

        public void validate() {
            if(this.name==null || this.company==null) {
                throw new RuntimeException("Ivalid inputs");
            }
        }
    }
}
