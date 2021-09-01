package com.company;

public class car {
    String mark;
    private int year;
    double volume;

    public car() {

    }

    public car(String mark, int year, double volume) {
        this.mark = mark;
        this.year = year;
        this.volume = volume;
    }

    public car(int year, String mark, double volume) {
        this.mark = mark;
        this.year = year;
        this.volume = volume;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1997){
            System.out.println("_________");
            System.out.println("Год может быть только выше 1997 !");
        }else {
            this.year = year;
        }
    }
}
