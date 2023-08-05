package org.example.lesson13.Employees;

import org.example.lesson13.Employee;
import org.example.lesson13.Worker;
import org.example.lesson13.enums.Position;
import org.example.lesson13.enums.Type;

public class Engineer extends Worker implements Employee {

    private Position position;

    public Engineer(String firstName, String lastName, String gender, int experience, Position position) {
        super(firstName, lastName, gender, experience, position);
    }

    public Position getPosition() {
        return this.position;
    }

    @Override
    public Type getType() {
        return Type.ENGINEER;
    }
}
