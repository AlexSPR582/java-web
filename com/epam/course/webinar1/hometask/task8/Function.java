package com.epam.course.webinar1.hometask.task8;

import static java.lang.Math.*;

public class Function {
    public double calculateFunc(double x) {
        if (x >= 3) {
            return calculateFirstFunc(x);
        } else {
            return calculateSecondFunc(x);
        }
    }

    private double calculateFirstFunc(double x) {
        return -1 * pow(x, 2) + 3 * x - 9;
    }

    private double calculateSecondFunc(double x) {
        return 1 / (pow(x, 3) - 6);
    }
}
