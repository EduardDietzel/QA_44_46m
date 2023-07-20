package javaForQA.lesson20_Date.task1;

import java.util.Calendar;
import java.util.Date;

public class DateTest2 {
    public static void main(String[] args) throws InterruptedException {

        // Date date1 = new Date(2000, 11, 21);
        Date date1 = new Date(100, Calendar.NOVEMBER, 21);
        Date date2 = new Date();
        // Date date3 = new Date(2010, 1, 3);
        Date date3 = new Date(110, Calendar.JANUARY, 3);

        System.out.println("Дата 3 наступила позже даты 1 - " + date3.after(date1));

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println("Дата 3 наступила перед датой 2 - " + date3.before(date2));
        System.out.println("Дата 1 наступила перед датой 3 - " + date1.before(date3));

        System.out.println("Сравниваем дату 2 и дату 3 - " + date3.compareTo(date2));
        // если -1 то первая дата больше

        System.out.println("Количество миллисекунд - " + date2.getTime());

        date2.setTime(158924564778L);
        System.out.println(date2);

        Date date4 = new Date();
        Thread.sleep(1);
        Date date5 = new Date();

        System.out.println("Эквивалентны ли дата 4 и дата 5 " + date4.equals(date5));

    }
}
