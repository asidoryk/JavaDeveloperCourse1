package org.example.lesson13;

public class Director extends Worker {
    private Position position;

    public Director(String firstName, String lastName, String gender, int experience, Position position) {
        super(firstName, lastName, gender, experience);
        this.position = position;
    }

    public Position getPosition() {
        return this.position;
    }
}
