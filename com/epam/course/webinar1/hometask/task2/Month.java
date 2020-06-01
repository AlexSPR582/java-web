package com.epam.course.webinar1.hometask.task2;

public class Month {
    public int countDays(int month, int year) {
        validation(month, year);
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            if (isLeap(year)) {
                return 29;
            }
            return 28;
        } else {
            return 31;
        }
    }

    public boolean isLeap(int year) {
        return year % 4 == 0;
    }

    private void validation(int month, int year) {
        if (month < 1 || month > 12 || year < 0) {
            throw new RuntimeException("Incorrect input");
        }
    }
}
