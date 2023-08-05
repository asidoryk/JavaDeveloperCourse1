package org.example.lesson13;


import org.example.lesson13.Employees.Director;
import org.example.lesson13.Employees.Engineer;
import org.example.lesson13.enums.Position;
import org.example.lesson13.services.SubordinateService;

import static org.example.lesson13.enums.Position.COMMUNICATION_ENGINEER;
import static org.example.lesson13.enums.Position.ROBOTICS_ENGINEER;

public class Test {
    public static void main(String[] args) {
        Director director = new Director("Alan", "Smith", "Male", 6, ROBOTICS_ENGINEER);
        System.out.println(director.toString());

        Engineer engineer = new Engineer("John", "Wake", "Male", 7, COMMUNICATION_ENGINEER);
        System.out.println(engineer.toString());

        Director director1 = new Director("Director1", "Director1", "Male", 10, Position.GENERAL_DIRECTOR);
        Director director2 = new Director("Director2", "Director2", "Female", 8, Position.DEPARTMENT_DIRECTOR);
        Director director3 = new Director("Director3", "Director3", "Male", 7, Position.DEPARTMENT_DIRECTOR);
        Director director4 = new Director("Director4", "Director4", "Female", 5, Position.DEPARTMENT_DIRECTOR);

        Worker engineer1 = new Engineer("Engineer1", "Engineer1", "Male", 6, Position.AUTOMATION_ENGINEER);
        Worker engineer2 = new Engineer("Engineer2", "Engineer2", "Female", 4, Position.ROBOTICS_ENGINEER);
        Worker engineer3 = new Engineer("Engineer3", "Engineer3", "Male", 3, Position.AUTOMATION_ENGINEER);
        Worker engineer4 = new Engineer("Engineer4", "Engineer4", "Female", 2, Position.ROBOTICS_ENGINEER);
        Worker engineer5 = new Engineer("Engineer5", "Engineer5", "Male", 4, Position.COMMUNICATION_ENGINEER);
        Worker engineer6 = new Engineer("Engineer6", "Engineer6", "Female", 3, Position.COMMUNICATION_ENGINEER);
        Worker engineer7 = new Engineer("Engineer7", "Engineer7", "Male", 1, Position.COMMUNICATION_ENGINEER);
        Worker engineer8 = new Engineer("Engineer8", "Engineer8", "Female", 2, Position.ROBOTICS_ENGINEER);
        Worker engineer9 = new Engineer("Engineer9", "Engineer9", "Male", 3, Position.AUTOMATION_ENGINEER);

        // add subordinates for Director 1
        director1.addSubordinate(director2);
        director1.addSubordinate(director3);
        director1.addSubordinate(engineer1);
        director1.addSubordinate(engineer2);

        // add subordinates for Director 2
        director2.addSubordinate(engineer3);
        director2.addSubordinate(engineer4);

        // add subordinates for Director 3
        director3.addSubordinate(engineer5);
        director3.addSubordinate(engineer6);
        director3.addSubordinate(director4);

        // add subordinates for Director 4
        director4.addSubordinate(engineer7);
        director4.addSubordinate(engineer8);
        director4.addSubordinate(engineer9);

        System.out.println("Salary for " + director1.getFirstName() + ": " + director1.calculateSalary());
        System.out.println("Salary for " + engineer1.getFirstName() + ": " + engineer1.calculateSalary());

        System.out.println("Engineer9 is subordinate of Director1: " + SubordinateService.isEmployeeUnderDirector(director1, engineer9.getFirstName()));

        System.out.println("Director1 Report:\n" + director1.toString());
    }

    }
