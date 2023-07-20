package javaForQA.lesson20_Date.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(2023, Calendar.JANUARY, 15);
        System.out.println(calendar);

        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        calendar.set(2020, Calendar.NOVEMBER, 20);
        month = calendar.get(Calendar.MONTH);
        System.out.println(month);

        calendar.set(Calendar.MONTH, 5);
        month = calendar.get(Calendar.MONTH);
        System.out.println(month);

        calendar.set(Calendar.MINUTE, 45);
        calendar.set(Calendar.HOUR, 5);
        calendar.set(Calendar.SECOND, 12);

        Date date = calendar.getTime();
        System.out.println(date);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(formatter.format(date));
        System.out.println(formatter1.format(date));
    }
}
