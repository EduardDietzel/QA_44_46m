package javaForQA.lesson20_Date.task5;

import java.time.ZonedDateTime;

public class ZonedDateTimeTest {
    public static void main(String[] args) {

        ZonedDateTime date = ZonedDateTime.now();
        System.out.println(date);

        System.out.println("Часовой пояс - " + date.getZone());


    }
}
