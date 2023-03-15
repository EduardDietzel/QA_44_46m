package javaForQA.lesson3Enum;

public class Main1 {
    public static void main(String[] args) {
        Day day = Day.FRIDAY;

        System.out.println(day);
        System.out.println(day.getValue());

//        System.out.println(Day.valueOf("THURSDAY"));

        Day day1 = Day.valueOf("THURSDAY");
        System.out.println(day1.getValue());

        System.out.println(day1.ordinal());
    }


}
