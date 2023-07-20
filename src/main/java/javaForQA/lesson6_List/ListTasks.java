package javaForQA.lesson6_List;

import java.util.ArrayList;
import java.util.List;

public class ListTasks {
    public static void main(String[] args) {

        // вывести все элементы в новую строку, при этом умножив на 3

        // Ctrl+D - копируем строчку с курсором
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(7);
        integers.add(2);
        integers.add(1);
        integers.add(0);
        integers.add(9);

        System.out.println(integers);

        for (Integer value : integers) {
            // 5 * 3 = 15
            System.out.printf("%d * 3 = %d\n", value, value * 3);
        }

        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();

        first.add("A");
        first.add("B");
        first.add("C");
        first.add("D");
        first.add("E");
        first.add("E");

        second.add("D");
        second.add("E");
        second.add("F");
        second.add("G");

        System.out.println(ListUtils.joinLists(first, second));

        System.out.println(ListUtils.joinWithoutDuplicates(first, second));

        System.out.println(ListUtils.difference(first, second));

    }
}
