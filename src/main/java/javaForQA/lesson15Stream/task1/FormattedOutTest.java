package javaForQA.lesson15Stream.task1;

import javaForQA.lesson2Extends.Cat;

import java.util.Date;

public class FormattedOutTest {
    public static void main(String[] args) {

        System.out.printf("One%nTwo%nThree");
        // printf - метод форматирования строки, умеет работать со служебными символами
        // %n - служебный символ перенос строки
        // метод println не умеет работать с такими служебными символами

        System.out.printf("%b%n", null);
        // %b - символ булевого значения, подстановка boolean переменной, либо другого типа
        // при этом отсутствие переданной переменной ссылки на объект (null), преобразуется в false

        Cat cat = null;
        System.out.printf("%b%n", cat);
        cat = new Cat();
        System.out.printf("%b%n", cat);
        // проверка, содержит ли переменная ссылку на объект
        // true если переменная ссылается на какой-либо объект
        // false, если нет (null)

        boolean b = true;
        System.out.printf("%b%n", b);
        b = false;
        System.out.printf("%b%n", b);

        System.out.printf("%b%n", 5);
        System.out.printf("%B%n", "Hello");
        // %B - дет в выводе большие символы - TRUE (в верхнем регистре)

        // %s - служит для подстановки в строку другой строки
        System.out.printf("[Строка - %s]%n", "Hello guys!");
        System.out.printf("[Строка - %.5s]%n", "Hello guys!");
        // %.5s - выводим первые 5 символов из той строки, которую подставляем к первой строке

        // %с - служит для подстановки в строку символа
        System.out.printf("[Символ - %c]%n", 'a');
        System.out.printf("[Символ - %C]%n", 'a'); // в этом случае символ "а" будет большой (в верхнем регистре) - "А"

        // %d - служит для подстановки целочисленного значения в строку
        int x = 100;
        System.out.printf("[Число - %d]%n", x);


        // %f - служит для подстановки дробного значения в строку
        // При этом мы можем ограничивать число знаков после запятой,
        // а так же необходимый отступ слева
        double pi = Math.PI;
        System.out.printf("[Число ПИ - %f]%n", pi);
        System.out.printf("[Округленное число ПИ - %.3f]%n", pi);
        System.out.printf("%50.3f%n", pi);
        System.out.printf("%50f%n", pi); // выровняли по правому краю
        System.out.println();

        // при (в момент) создании объекта Date в него заносится (создается) текущая дата (и время) в момент создания объекта
        // пример: Fri Jun 16 10:11:12 CEST 2023
        Date currentDate = new Date();
        System.out.println(currentDate);

        // %t отвечает за подстановку даты в строку
        // T - подстановка времени из текущего объекта даты
        // System.out.printf("%t%n", currentDate);
        System.out.printf("%tT%n", currentDate);

        System.out.printf("Часы - %tH, минуты - %tM, секунды - %tS %n", currentDate, currentDate, currentDate);
        System.out.println();

        // A - день недели, d - день месяца, B - месяц, Y - год
        System.out.printf("Текущая дата - %tA, %td %tB %tY года %n", currentDate, currentDate, currentDate, currentDate);
        System.out.println();

        // чтобы не писать currentDate много раз, можно обращаться только к одному переданному аргументу (1)
        // конструкция 1$ позволяет указать номер переменной по порядку
        System.out.printf("Текущая дата - %1$tA, %1$td %1$tB %1$tY года %n", currentDate);
        System.out.println();

    }
}
