package org.example.lesson13.Employees;

import org.example.lesson13.Employee;
import org.example.lesson13.Worker;
import org.example.lesson13.enums.Position;
import org.example.lesson13.enums.Type;

import java.util.ArrayList;
import java.util.List;

public class Director extends Worker implements Employee {

    private List<Worker> subordinates = new ArrayList<>();


    public Director(String firstName, String lastName, String gender, int experience, Position position) {
        super(firstName, lastName, gender, experience, position);
    }

    // Для директора создать метод, который будет назначать в подчинение директора сотрудника (не важно инженера или директора)
    public void addSubordinate(Worker employee) {
        subordinates.add(employee);
    }

    public List<Worker> getSubordinates() {
        return subordinates;
    }

    //Так же для директора переопределить расчет зарплаты и добавить надбавку за количество сотрудников находящихся в ***непосредственном*** подчинении.
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (subordinates.size() * 100);
    }

    @Override
    public Type getType() {
        return Type.DIRECTOR;
    }
}
