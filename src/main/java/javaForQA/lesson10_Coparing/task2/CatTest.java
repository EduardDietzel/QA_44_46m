package javaForQA.lesson10_Coparing.task2;

import java.util.*;

public class CatTest {
    public static void main(String[] args) {


//        Cat cat1 = new Cat("B", 1, 3.65);
//        Cat cat2 = new Cat("B", 1, 3.65);

        Cat cat1 = new Cat(1, 3.65);
        Cat cat2 = new Cat(1, 3.65);

        boolean result = cat1.equals(cat2);
        System.out.println("Result: " + result);
        System.out.println();

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("A-кот", 3, 2.52));
        cats.add(new Cat("B-кот", 2, 2.15));
        cats.add(new Cat("C-кот", 5, 3.45));
        cats.add(new Cat("D-кот", 4, 2.87));
        cats.add(new Cat("D-кот", 2, 3.17));
        cats.add(new Cat("D-кот", 3, 3.33));
        cats.add(new Cat("D-кот", 3, 2.33));
        cats.add(new Cat("D-кот", 3, 2.53));
        cats.add(new Cat("D-кот", 3, 1.98));
        cats.add(new Cat("E-кот", 1, 3.18));

        // для сортировки есть метод Collections.sort()
        // нужно выбрать критерии для сравнения
        // на помощь нам придет интерфейс Компаратор
        Collections.sort(cats, new CatComparatorByNameAndAge());

        for (Cat cat: cats) {
            System.out.println(cat);
        }

        Set<Cat> cats1 = new TreeSet<>(new AllParametersComparator());

        cats1.add(new Cat("A-кот", 3, 2.52));
        cats1.add(new Cat("B-кот", 2, 2.15));
        cats1.add(new Cat("C-кот", 5, 3.45));
        cats1.add(new Cat("D-кот", 4, 2.87));
        cats1.add(new Cat("D-кот", 2, 3.17));
        cats1.add(new Cat("D-кот", 3, 3.33));
        cats1.add(new Cat("D-кот", 3, 2.33));
        cats1.add(new Cat("D-кот", 3, 2.53));
        cats1.add(new Cat("D-кот", 3, 1.98));
        cats1.add(new Cat("E-кот", 1, 3.18));
        
        System.out.println();
        System.out.println("Output: TreeSet");

        for (Cat cat : cats1) {
            System.out.println(cat);
        }

    }
}
