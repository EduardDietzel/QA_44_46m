package javaForQA.lesson12_HashMap.task1;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        // задаем ключи (строка) и их числовые значения

        map.put("Apple", 78);
        map.put("Orange", 56);
        map.put("Banana", 45);
        map.put("Mango", 99);
        map.put("Grape", 150);
        map.put("Birn", 34);
        map.put("Cherry", 40);
        map.put("Orange", 62);

        System.out.println("Цена манго: " + map.get("Mango"));
        System.out.println("Цена апельсина: " + map.get("Orange"));
        //программа выдала вторую цену, так как второе значение перезаписывает первое значение с одинаковым ключом
        System.out.println(map.get("Pear")); // программа выдаст null

        Set<String> set = new HashSet<>();
        Iterator<String> setIterator = set.iterator();
        // в Сете элементы хранятся сами по себе, а в Мэпе - пары
        for (String value: set) {

        }

        // поскольку в Мэпе тип переменной в виде пары, мы и задаем переменную в цикле как пару String и Integer
        // Map - родительский интерфейс, Entry - дочерний интерфейс

        for (Map.Entry<String, Integer> pair : map.entrySet()){
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.printf("Продукт - %s, цена - %d\n", key, value);
        }

        System.out.println("---------");
        // Задача: нам надо удалить из Мэпа яблоки и товары с ценой выше 90
        // используем итератор для обработки Мэпа
        System.out.println("Обработка  при помощи итератора:");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();

            if ("Apple".equals(key) || value > 90) {
                iterator.remove();
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()){
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.printf("Продукт - %s, цена - %d\n", key, value);
        }

        System.out.println();
        // выведем список товаров без цен
        System.out.println("Все товары в магазине");

        for (String key: map.keySet()) {
            System.out.println(key);
        }

        System.out.println();
        // выведем все цены магазина
        System.out.println("все цены магазина");
        for (Integer value: map.values()){
            System.out.println(value);
        }
    }
}
