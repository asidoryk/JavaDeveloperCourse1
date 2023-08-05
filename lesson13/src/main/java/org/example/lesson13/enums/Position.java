package org.example.lesson13.enums;

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
