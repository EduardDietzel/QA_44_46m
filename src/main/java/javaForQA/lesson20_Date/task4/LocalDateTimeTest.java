package javaForQA.lesson20_Date.task4;

import java.time.LocalDateTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.of(2023, 5, 12, 3, 15);
        System.out.println(date);

        LocalDateTime date1 = date.plusHours(3);
        LocalDateTime date2 = date1.minusMinutes(20).plusYears(1);
        System.out.println(date2);

    }
}
