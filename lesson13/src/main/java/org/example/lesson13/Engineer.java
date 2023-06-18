package org.example.lesson13;

public class Engineer extends Worker{

    private Position position;

    public Engineer(String firstName, String lastName, String gender, int experience, Position position) {
        super(firstName, lastName, gender, experience);
        this.position = position;
    }

    public Position getPosition() {
        return this.position;
    }
}
