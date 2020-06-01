package com.epam.course.webinar1.hometask.task1;

public class LastNumber {
    public int getLastNumeral(int n) {
        int lastNumeral = -1;
        switch (n % 10) {
            case 0:
                lastNumeral = 0;
                break;
            case 1:
                lastNumeral = 1;
                break;
            case 2:
                lastNumeral = 4;
                break;
            case 3:
                lastNumeral = 9;
                break;
            case 4:
                lastNumeral = 6;
                break;
            case 5:
                lastNumeral = 5;
                break;
            case 6:
                lastNumeral = 6;
                break;
            case 7:
                lastNumeral = 9;
                break;
            case 8:
                lastNumeral = 4;
                break;
            case 9:
                lastNumeral = 1;
                break;
        }
        return lastNumeral;
    }
}
