package javaForQA.lesson3Enum;

public class Main {
    public static void main(String[] args) {

        Day day = Day.THURSDAY;

//        if (day.equals(Day.MONDAY)) {
//            System.out.println("Это понедельник.");
//        } else {
//            System.out.println("Это не понедельник. Это другой день.");
//        }

//        switch (day) {
//            case MONDAY -> System.out.println("Это понедельник.");
//            case TUESDAY -> System.out.println("Это вторник.");
//            case WEDNESDAY -> System.out.println("Это среда.");
//            case THURSDAY -> System.out.println("Это четверг.");
//            case FRIDAY -> System.out.println("Это пятница.");
//        }

        switch (day) {
            case MONDAY:
                System.out.println("Это понедельник.");
                break;
            case TUESDAY:
                System.out.println("Это вторник.");
                break;
            case WEDNESDAY:
                System.out.println("Это среда.");
                break;
            case THURSDAY:
                System.out.println("Это четверг.");
                break;
            case FRIDAY:
                System.out.println("Это пятница.");
                break;
            case SATURDAY:
                System.out.println("Это суббота");
                break;
            case SUNDAY:
                System.out.println("Это воскресенье");
                break;

        }


    }

}
