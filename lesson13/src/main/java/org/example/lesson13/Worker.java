package org.example.lesson13;

import org.example.lesson13.enums.Position;
import org.example.lesson13.enums.Type;

public class Worker implements Employee{
    private String firstName;
    private String lastName;
    private String gender;
    private int experience;

    private Position position;


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

    public Worker(String firstName, String lastName, String gender, int experience, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.experience = experience;
        this.position = position;
    }

//    Так же данный класс должен уметь считать зарплату рабочего по формуле
//            зарплата = коеффициент_долженности * (стаж + 1)

    public double calculateSalary() {
        return position.getCoefficient() * (experience + 1);
    }

    @Override
    public String toString() {
        return "Salary for " + this.firstName + " " + this.lastName + " with " + this.experience + " year(s) experience " + "is " + calculateSalary();
    }

    @Override
    public Type getType() {
        return null;
    }
}

