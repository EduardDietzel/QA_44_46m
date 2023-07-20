package javaForQA.lesson20_Date.task1;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {

        Date date1 = new Date();
        Date date2 = new Date(2222222222L);

        System.out.println(date1);
        System.out.println(date2);

    }
}
