package javaForQA.lesson9_Set.task5;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        // Set<String> set = new HashSet<>(); // распределяет рандомно
        Set<String> set = new LinkedHashSet<>(); // распределяет в порядке добавления
        // Set<String> set = new TreeSet<>(); // распределяем по порядку (алфавит к примеру)

        set.add("Apple");
        set.add("Banana");
        set.add("Cocos");
        set.add("Dateln");
        set.add("Peach");
        set.add("Fruit");
        set.add("Grape");
        set.add("Birn");
        set.add("Kiwi");
        set.add("Orange");
        set.add("Lime");

        System.out.println(set);
    }
}
