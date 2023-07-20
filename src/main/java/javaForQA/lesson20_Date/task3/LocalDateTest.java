package javaForQA.lesson20_Date.task3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class LocalDateTest {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2022, Month.FEBRUARY, 3);
        System.out.println(date);

        System.out.println("Год - " + date.getYear());
        System.out.println("Месяц - " + date.getMonthValue());

        System.out.println("Порядковый номер дня в месяце - " + date.getDayOfMonth());
        System.out.println("Порядковый номер дня в году - " + date.getDayOfYear());
        System.out.println("Порядковый номер дня в неделе - " + date.getDayOfWeek().ordinal());
        System.out.println("День недели - " + date.getDayOfWeek());

        LocalDate date1 = date.plusWeeks(2);
        System.out.println(date1);

        LocalDate date2 = date.minusYears(3);
        System.out.println(date2);

    }
}
