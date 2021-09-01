package com.company;

public class Main {

    public static void main(String[] args) {
        car car1 = new car();
        car1.mark = "Nissan";
        car1.setYear(1997);
        car1.volume = 3.3;

        System.out.println("_________");
        System.out.println("Марка автомобиля: " + car1.mark + ". " + "Год выпуска автомобиля: " + car1.getYear()
                + ", " + "Объём двигателя: " + car1.volume + ". ");
        System.out.println("_________");


        car car2 = new car("Mark ||", 1995, 2.0);
        System.out.println("Марка автомобиля: " + car2.mark + ", "
                + "Год выпуска автомобиля: " + car2.getYear() + ", " + "Объём двигателя: " + car2.volume + ". ");
        System.out.println("_________");


        car car3 = new car("Subaru", 2001, 2.0);
        System.out.println("Марка автомобиля: " + car3.mark + ", "
                + "Год выпуска автомобиля: " + car3.getYear() + ", " + "Объём двигателя: " + car3.volume + ". ");
        System.out.println("_________");

    }
}
