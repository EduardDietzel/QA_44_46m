package javaForQA.lesson18.task6;

import javaForQA.lesson16TryCatch.task4.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Long> list1 = new ArrayList<>();
        list1.add(45L);
        list1.add(12345L);
        list1.add(100L);

        List<Double> list2 = new ArrayList<>();
        list2.add(45.12);
        list2.add(123.453);
        list2.add(998.999);

        NumberUtils utils = new NumberUtils();
        utils.printIntegers(list1);
        System.out.println();
        utils.printIntegers(list2);

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(3, "Gray", 4));
        utils.printIntegers(cats);
        // работать не будет, поскольку кот - не число

    }
}
