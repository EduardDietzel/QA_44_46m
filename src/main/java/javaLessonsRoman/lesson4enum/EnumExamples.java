package javaLessonsRoman.lesson4enum;

import java.util.Arrays;

/**
 * Enum - constructor and methods
 * - enum может содержать конструктор
 * - Конструктор вызывается отдельно для каждой константы перечисления во время загрузки класса перечисления
 * - Мы не можем явно создавать объекты перечисления во время загрузки класса перечисления
 * - enum может содержать как конкретные методы, так и абстрактные методы
 * - Каждое из перечислений должно дать реализацию абстрактных методов, если таковые имеются
 */

public class EnumExamples {

    public static void main(String[] args) {
        DaysOfWeeks d = DaysOfWeeks.MO;
        System.out.println(d);

//        d.print();
//        d.printResult();

        // разберем вариант в switch
//        switch (d) {
//            case MO -> System.out.println("Monday");
//            case WE -> System.out.println("Wednesday");
//            case FR -> System.out.println("Friday");
//            case SU -> System.out.println("Sunday");
//        }
        DaysOfWeeks[] values = DaysOfWeeks.values();
        System.out.println(Arrays.toString(values));
        // выводим список констант в виде массива

        System.out.println(DaysOfWeeks.MO.ordinal());
        // выводим номер индекса константы перечисления, как индекс массива

        System.out.println(DaysOfWeeks.valueOf("FR").getPrice());
        // Метод valueOf() возвращает константу перечисления указанного строкового значения, если оно существует
        System.out.println(DaysOfWeeks.MO + " " + DaysOfWeeks.MO.getPrice());

        for (int i = 0; i < DaysOfWeeks.values().length; i++) {
            System.out.println(
                DaysOfWeeks.valueOf(DaysOfWeeks.values()[i].toString()) + " " + DaysOfWeeks.valueOf(DaysOfWeeks.values()[i].toString()).getPrice()
            );
        }
        // или то же самое только другим способом
        for (int i = 0; i < DaysOfWeeks.values().length; i++) {
            System.out.println(
                DaysOfWeeks.values()[i] + " " + DaysOfWeeks.values()[i].getPrice()
            );
        }

        for (DaysOfWeeks x : DaysOfWeeks.values()) {
            System.out.println(
                    x + " " + x.getPrice() + " " + x.printMenu()
            );
            x.printMenu();
        }
    }
}

/**
 * Enum - values(), ordinal(), valueOf()
 * Эти методы присутствуют внутри java.lang.Enum
 * Метод values() можно использовать для возврата всех значений, присутствующих внутри перечисления
 * В перечислениях важен порядок. С помощью метода ordinal() можно найти индекс каждой константы перечисления, как индекс массива
 * Метод valueOf() возвращает константу перечисления указанного строкового значения, если оно существует
 */

enum DaysOfWeeks { //implements TTTT, AAAAA {
    MO(10) {
        @Override
        String printMenu(){
            return "broccoli";
        }
    },
    TU(11) {
        @Override
        String printMenu(){
            return "pizza Margarita";
        }
    },
    WE(12){
        @Override
        String printMenu(){
            return "fish sup";
        }
    },
    TH(13){
        @Override
        String printMenu(){
            return "meat with potato";
        }
    },
    FR(14){
        @Override
        String printMenu(){
            return "pasta";
        }
    },
    SA(15){
        @Override
        String printMenu(){
            return "grill menu";
        }
    },
    SU(16){
        @Override
        String printMenu(){
            return "sushi";
        }
    };

    /**
     * каждая константа перечисления представляет собой объект типа перечисления
     * тип перечисления может быть передан в качестве аргумента в switch
     * каждая константа перечисления всегда неявно является public static final
     * мы можем объявить метод main() внутри перечисления
     * все перечисления неявно расширяют класс java.lang.Enum
     * метод toString переопределен в классе java.lang.Enum
     * enum может реализовать множество интерфейсов
     */

    private final int price;
    // создадим конструктор для определения прайса по дням
    DaysOfWeeks(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    abstract String printMenu();

//    @Override
//    public void print() {
//        System.out.println("hello from print method");
//    }
//
//    @Override
//    public void printResult() {
//        System.out.println("hello from printResult method");
//    }
}

interface TTTT {
    void print();
}

interface AAAAA {
    void printResult();
}