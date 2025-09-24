package study.unit4.practice1.equals;

import java.util.Objects;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int days) {
        this.year = year;
        this.month = month;
        this.day = days;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if(obj instanceof MyDate){
            MyDate myDate = (MyDate) obj;
            return this.year == myDate.year && this.month == myDate.month && this.day == myDate.day;
        }

        return false;
    }

}
