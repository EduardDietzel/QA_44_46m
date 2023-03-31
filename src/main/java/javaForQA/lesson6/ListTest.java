package javaForQA.lesson6;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<Integer> integers =new ArrayList<>();

        integers.add(0, 3);
        integers.add(1, 5);
        integers.add(2, 7);
        integers.add(3, 15);

        System.out.println(integers);

        integers.add(1, 8); // здесь мы вставляем под индекс 1 новый элемент со сдвигом всех элементов
        System.out.println(integers);

        integers.set(1, 9); // здесь мы вставили элемент с заменой (add - добавление, set - замена)
        System.out.println(integers);

        integers.add(4); // такой метода добавляет элемент в конец списка (без указания индекса).
        System.out.println(integers);

        List<Integer> integers1 = new ArrayList<>();

        integers1.add(20);
        integers1.add(30);
        integers1.add(40);

        integers.addAll(2, integers1); // мы вставили в первый лист на 2 индекс полностью второй лист (из 3-х элементов)
        System.out.println(integers);

        // Рассмотрим метод remove, удаляющий элементы из Листа.
        integers.remove(3);
        System.out.println(integers);

        integers.set(3, null); // удалили элемент, оставив пустым место под этим индексом.
        System.out.println(integers);

        // Создадим лист "Стрингов"
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World!");
        words.add("I");
        words.add("Java!");
        words.add(3, "study");

        System.out.println(words);

        // Если создать Лист Объектов, тогда можно совместить и Стринги, и Интеджеры (числа)
        List<Object> objects = new ArrayList<>();
        objects.add("Hello");
        objects.add(new Integer(5));

        System.out.println(objects);

        words.remove(0);  // удалили объект по индексу
        words.remove("Java!"); // удалили объект по имени
        System.out.println(words);

        words.add(0, "Hello");
        words.add("Java!");
        System.out.println(words);

        List<String> otherWords = new ArrayList<>();
        otherWords.add("First");
        otherWords.addAll(words); // добавили в новый список весь объем другого списка - words
        System.out.println(otherWords);

        System.out.println(words.get(3)); // вывели на консоль непосредственно сам объект из списка под конкретным индексом
        System.out.println(words.size());

        otherWords.clear();
        System.out.println(otherWords);
        otherWords.add("First");
        System.out.println(otherWords);

//        int index = words.indexOf("I");
//        System.out.println(index);
//        words.add(index +1, "like");
        // Или то же самое можно написать короче, одной строкой
        words.add(words.indexOf("I") + 1, "like");
        System.out.println(words);

        // Проверяем листы на пустоту
        System.out.println(words.isEmpty());
        otherWords.clear();
        System.out.println(otherWords.isEmpty());

        // Метод Контэйнс - проверяет наличие определенного объекта в данном Листе(списке)
        System.out.println(words.contains("study"));
        System.out.println(words.contains("learn"));

        // Итерируем Листы с прохождением по нему циклом
        // пишем цикл, задаем управляющую переменную и размер списка -  < words.size()
        // если надо пройтись через один индекс, то пишем так: "i += 2" вместо "i++"
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

        // каждый раз перезаписываем переменную и выводим новое её значение
        for (String currentWord : words) {
            System.out.println(currentWord);
        }

        // вывести с пронумерованным списком:
        for (int i = 0; i < words.size(); i++) {
            // 1. Hello
            System.out.printf("%d. %s\n", i + 1, words.get(i)); // d - digital (числовая переменная), s - String, \n - перевод строки
            // i + 1 задаем начальный номер списка (для машины начинается с 0), дальше программа сама добавляет 1
            // words.get(i) - выводим объект под номером индекса
        }
    }
}
