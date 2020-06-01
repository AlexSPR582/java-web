package com.epam.course.webinar1.hometask.task9;

import static java.lang.Math.*;

public class CircleLogic {
    public double countPerimeter(double radius) {
        return 2 * PI * radius;
    }

    public double countArea(double radius) {
        return PI * pow(radius, 2);
    }
}
