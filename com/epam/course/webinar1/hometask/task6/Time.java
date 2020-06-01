package com.epam.course.webinar1.hometask.task6;

public class Time {
    public void getTime(int seconds) {
        validation(seconds);
        int hours = getHours(seconds);
        int minutes = getMinutes(seconds - hours * 3600);
        int newSeconds = seconds - (hours * 3600 + minutes * 60);
        System.out.println(hours + "ч. " + minutes + "мин. " + newSeconds + "сек.");
    }

    private int getHours(int seconds) {
        return seconds / 3600;
    }

    private int getMinutes(int seconds) {
        return seconds / 60;
    }

    private void validation(int seconds) {
        if (seconds < 0 || seconds > 86400) {
            throw new RuntimeException("Incorrect input");
        }
    }
}
