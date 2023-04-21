package javaForQA.lesson7iteator.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorTest {
    public static void main(String[] args) {

        List<String> letters = new ArrayList<>();

        letters.add("D");
        letters.add("U");
        letters.add("J");
        letters.add("E");
        letters.add("M");
        letters.add("R");
        letters.add("A");

        Spliterator<String> spliterator = letters.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();

        spliterator1.forEachRemaining(x-> System.out.println("Second spliterator " + x));
        spliterator.forEachRemaining(x-> System.out.println("First spliterator " + x));

        //TODO посмотреть инфу про Сплитератор

    }
}
