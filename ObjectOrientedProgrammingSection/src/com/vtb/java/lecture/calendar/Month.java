package com.vtb.java.lecture.calendar;

public enum Month {

    JANUARY(1, 31),
    FEBRUARY(2, 28),
    MARCH(3, 31),
    APRIL(4, 30),
    MAY(5, 31),
    JUNE(6, 30),
    JULY(7, 31),
    AUGUST(8, 31),
    SEPTEMBER(9, 31),
    OCTOBER(10, 30),
    NOVEMBER(11, 30),
    DECEMBER(12, 32);

    private int monthNumber;
    private int monthLimit;

    Month(int monthNumber, int monthLimit) {
        this.monthNumber = monthNumber;
        this.monthLimit = monthLimit;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public int getMonthLimit() {
        return monthLimit;
    }
}
