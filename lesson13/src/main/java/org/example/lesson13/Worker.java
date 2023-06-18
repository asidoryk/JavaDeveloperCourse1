package org.example.lesson13;

public abstract class Worker {
    private String firstName;
    private String lastName;
    private String gender;
    private int experience;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getExperience() {
        return experience;
    }

    public Worker(String firstName, String lastName, String gender, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.experience = experience;
    }

//    Так же данный класс должен уметь считать зарплату рабочего по формуле
//            зарплата = коеффициент_долженности * (стаж + 1)

    public double calculateSalary(double coefficient) {
        return coefficient * (experience + 1);
    }

    public enum Position {
        GENERAL_DIRECTOR(800),
        DEPARTMENT_DIRECTOR(600),
        AUTOMATION_ENGINEER(400),
        ROBOTICS_ENGINEER(400),
        COMMUNICATION_ENGINEER( 500.0);

        private double coefficient;

        Position(double coefficient) {
            this.coefficient = coefficient;
        }

        public double getCoefficient() {
            return coefficient;
        }
    }
}

