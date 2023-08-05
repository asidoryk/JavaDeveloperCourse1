package org.example.lesson13;


import static org.example.lesson13.Worker.Position.COMMUNICATION_ENGINEER;
import static org.example.lesson13.Worker.Position.ROBOTICS_ENGINEER;

public class Test {
    public static void main(String[] args) {
        Director director = new Director("Alan", "Smith", "Male", 6, ROBOTICS_ENGINEER);
        System.out.println("Salary for " + director.getFirstName() + " " + director.getLastName() + " is " + director.calculateSalary(director.getPosition().getCoefficient()));

        Engineer engineer = new Engineer("John", "Wake", "Male", 7, COMMUNICATION_ENGINEER);
        System.out.println("Salary for " + engineer.getFirstName() + " " + engineer.getLastName() + " is " + engineer.calculateSalary(engineer.getPosition().getCoefficient()));

    }
}
