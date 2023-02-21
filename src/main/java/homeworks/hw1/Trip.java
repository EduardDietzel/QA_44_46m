package homeworks.hw1;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Trip {
    public static void main(String[] args) {

        System.out.println("Продолжительность путешествия из Берлина в Мюнхен в зависимости от вида транспорта.");

        TypOfTrip[] values = TypOfTrip.values();
        System.out.println(Arrays.toString(values));

        for (int i = 0; i < TypOfTrip.values().length; i++) {
            System.out.println(
                    TypOfTrip.values()[i] + " " + TypOfTrip.values()[i].getTime() + " часа"
            );
        }

//        System.out.println("Выберите из списка тип путешествия:");
//        Scanner keyboard = new Scanner(in);
//        String type = keyboard.next();


    }
}

enum TypOfTrip {
    AIRPLANE(1.667),
    TRAIN(4.817),
    AUTO(5.783),
    BIKE(37.100),
    ON_FOOT(118.000);

    private double time;
    // создадим конструктор для определения продолжительность поездки
    TypOfTrip(double time) {
        this.time = time;
    }

    public static TypOfTrip type() {
        return type();
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}

