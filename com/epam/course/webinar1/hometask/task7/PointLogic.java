package com.epam.course.webinar1.hometask.task7;

import static java.lang.Math.*;

public class PointLogic {
    public void findNearestPoint(Point p1, Point p2) {
        if (countDistance(p1) < countDistance(p2)) {
            System.out.println(p1.getX() + " " + p1.getY());
        } else if (countDistance(p1) > countDistance(p2)) {
            System.out.println(p2.getX() + " " + p2.getY());
        } else {
            System.out.println("точки находятся на одинаковом расстоянии от начала координат");
        }
    }

    private double countDistance(Point point) {
        return sqrt(pow(point.getX(), 2) + pow(point.getY(), 2));
    }
}
