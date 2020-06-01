package com.epam.course.webinar1.hometask.task10;

import static java.lang.Math.*;

public class FunctionRange {
    public void countFunction(double num1, double num2, double step) {
        while (num1 <= num2) {
            System.out.println(num1 + " " + tan(num1));
            num1 += step;
        }
    }
}
