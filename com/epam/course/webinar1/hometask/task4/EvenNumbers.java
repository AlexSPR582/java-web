package com.epam.course.webinar1.hometask.task4;

public class EvenNumbers {
    public void isHaveTwoEvenNumbers(int a, int b, int c, int d) {
        if (countEvenNumbers(a, b, c, d) > 1) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    private int countEvenNumbers(int a, int b, int c, int d) {
        int evenNumbers = 0;
        if (a % 2 == 0) {
            evenNumbers++;
        }
        if (b % 2 == 0) {
            evenNumbers++;
        }
        if (c % 2 == 0) {
            evenNumbers++;
        }
        if (d % 2 == 0) {
            evenNumbers++;
        }
        return evenNumbers;
    }
}
