package javaForQA.lesson9_Set.task1;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {

        // set - это список, который сам сортирует внутри себя элементы по порядку (по алфавиту или возрастанию).
        // не нуждается в дополнительной сортировке, делает это сам, просто добавляем новый элемент и он станет на свое место.
        // сет не добавит в себя элемент, аналог которого уже есть в сете.

        SortedSet<String> set = new TreeSet<>();

        set.add("D");
        set.add("A");
        set.add("C");
        set.add("B");
        set.add("C");

        System.out.println(set);

        System.out.println(set.contains("B"));
        System.out.println(set.contains("E"));

        // выводим первый и последний элементы
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // можно удалять элементы из сета
        boolean removeResult = set.remove("B"); // при успешном удалении элемента метод вернёт тру
        boolean removeResult1 = set.remove("S"); // этого элемента нет в сете, метод вернет фолс!
        // boolean использовали для того, чтобы вывести результат на консоль. Можно не использовать переменные.

        System.out.println(removeResult);
        System.out.println(removeResult1);

        System.out.println(set);

        // выведем список сета по порядку в каждой строке по элементу
        for (String setElement : set) {
            System.out.println(setElement);
        }

    }
}
