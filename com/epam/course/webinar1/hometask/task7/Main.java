package com.epam.course.webinar1.hometask.task7;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(5, 6);
        Point point2 = new Point(2, 4);
        PointLogic pointLogic = new PointLogic();
        pointLogic.findNearestPoint(point1, point2);
    }
}
