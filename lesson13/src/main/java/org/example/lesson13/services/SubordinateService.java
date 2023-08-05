package org.example.lesson13.services;

import org.example.lesson13.Employees.Director;
import org.example.lesson13.Worker;
import org.example.lesson13.enums.Type;

public class SubordinateService {

    public static boolean isEmployeeUnderDirector(Director director, String employeeName) {
        if (director == null || employeeName == null) {
            return false;
        }

        for (Worker subordinate : director.getSubordinates()) {
            if (subordinate.getType() == Type.DIRECTOR) {
                if (isEmployeeUnderDirector((Director) subordinate, employeeName)) {
                    return true;
                }
            } else if (subordinate.getFirstName().equals(employeeName)) {
                return true;
            }
        }

        return false;
    }
}
