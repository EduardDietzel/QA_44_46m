package javaLessonsRoman.lesson4enum;

import java.util.Arrays;

public class EnumExamples {

    public static void main(String[] args) {
        DaysOfWeeks d = DaysOfWeeks.MO;
        System.out.println(d);

        d.print();
        d.printResult();

        // разберем вариант в switch
        switch (d) {
            case MO -> System.out.println("Monday");
            case WE -> System.out.println("wednesday");
            case FR -> System.out.println("Friday");
            case SU -> System.out.println("Sunday");
        }
        DaysOfWeeks[] values = DaysOfWeeks.values();
        System.out.println(Arrays.toString(values));
        // выводим список констант в виде массива

        System.out.println(DaysOfWeeks.MO.ordinal());
        // выводим номер индекса константы перечисления, как индекс массива

        System.out.println(DaysOfWeeks.valueOf("FR").getPrice());

        System.out.println(DaysOfWeeks.MO + " " + DaysOfWeeks.MO.getPrice());

        for (int i = 0; i < DaysOfWeeks.values().length; i++) {
            System.out.println(DaysOfWeeks.valueOf(DaysOfWeeks.values()[i].toString()) + " " + DaysOfWeeks.valueOf(DaysOfWeeks.values()[i].toString()).getPrice());
        }

        for (int i = 0; i < DaysOfWeeks.values().length; i++) {
            System.out.println(
                    DaysOfWeeks.values()[i]
                            + " " +
                            DaysOfWeeks.values()[i].getPrice()
            );
        }


    }
}

enum DaysOfWeeks implements TTTT, AAAAA {
    MO(10),
    TU(11),  WE(12),
    TH(13),  FR(14),
    SA(15),  SU(16);

    private int price;

    // создадим конструктор для определения прайса по дням
    DaysOfWeeks(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("hello from print method");
    }

    @Override
    public void printResult() {
        System.out.println("hello from printResult method");
    }
}

interface TTTT {
    void print();
}

interface AAAAA {
    void printResult();
}