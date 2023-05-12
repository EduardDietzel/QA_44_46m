package javaForQA.lesson9_Set.task3;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSetTest {

    public static void main(String[] args) {

        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

        set.add("Apple");
        set.add("Lemon");
        set.add("Orange");
        set.add("Banana");
        set.add("Tomate");
        set.add("Apple");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
