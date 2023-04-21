package javaForQA.lesson7iteator.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {

        List<String> letters = new ArrayList<>();

        letters.add("D");
        letters.add("U");
        letters.add("J");
        letters.add("E");
        letters.add("M");

        ListIterator<String> iterator = letters.listIterator();

        while (iterator.hasNext()) {
            String current = iterator.next();
            System.out.print(current + " ");
            if (current.equals("E")) {
                break;
            }
        }
        System.out.println();

        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}
