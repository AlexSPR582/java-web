package com.epam.course.webinar1.hometask.task5;

public class PerfectNumber {
    public void isPerfectNumber(int num) {
        if (num == sumDenominators(num)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private int sumDenominators(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
