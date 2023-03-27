package javaForQA.lesson4.task3;

import javaForQA.lesson4.task2.Person;

public class BoxingTest {
    public static void main(String[] args) {

        Integer integer = new Integer(12);
        // Это старая версия написания,  в Джаве до 4-й версии, поэтому подчеркнуто красным.
        Integer objectInt = 12;
        // Это новый вариант записи. Создание объекта с помощью автоупаковки.
        int primitiveInt = objectInt;

        int i = integer;
        // это "автораспаковка"

        double d = 2.5;
        // это "автоупаковка"

        Person person = new Person(8);


    }
}
